package SetandHashSet.TimChallenge;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

//    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;
//    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//        this.name = name;
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }


    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    // avoiding the code calling this class to have access to this object

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<HeavenlyBody>(this.satellites);
    }


    /**
     * Why the equals has been changed to check for instanceof HeavenlyBody
     *
     * @param obj
     * @return We intend to subclass HeavenlyBody (extends) to create the planet moon and other objects.
     * That's why we are testing in this class with instanceof.
     * Essentially, we need to know if the two objects with the same name also have the same body.
     * If they do, there is equality, else, they're not equal.
     * <p>
     * Other important consideration: to make the equals symmetric, we need to declare the method as final
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // comparing the same object in memory, of course returns true;
            return true;
        }
        if (obj instanceof HeavenlyBody) { // is it the right type of class we have received as parameter?
            HeavenlyBody theObject = (HeavenlyBody)obj; // yes, correct, cast the object to the correct type (HeavenlyBody) obj and create a reference
            return this.key.equals(theObject.getKey());
//            if (this.name.equals(theObject.name)) { // if the name equals the object name
//                return this.bodyType == theObject.getBodyType(); // yes, it's equal
//            }
        }
        return false; // false, either the name is different or the body type is different
    }

    // equals doc's:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-


    /**
     * Why the + 57
     *
     * @return The same object MUST always generate THE SAME HASHCODE during any execution of your program.
     * You could add zero to it, so that every instance of your object would then have the same hashcode.
     * This would certainly satisfy the requirement of two objects having the same hashcode if compared.
     * However, this is a non efficient approach. If every object of a Hash collection ends in the same bucket,
     * you totally loose the performance benefit of using an Hash collection. This is because once the single bucket has been located,
     * which in this case would be bucket 0, then each and every element would need to be compared to see if the required one is in there.
     * Adding a number to names hashcode will effectively make the hashcodes different, and this is why it's been done here.
     * Why? Because there is a hashcode call to the String name. The value received from hashCode() is a number, and it is used as bucket number.
     * This bucket number is the address of the element inside the set/map.
     * When you do contains() it will take the hash code of the element, then look for the bucket where hash code points to.
     * If more than 1 element is found in the same bucket (multiple objects can have the same hash code),
     * then it uses the equals() method to evaluate if the objects are equal,
     * and then decide if contains() is true or false, or decide if element could be added in the set or not.
     * Why 57? It's just a number that is small enough not to risk integer overflowing, any number that respond to this requirement would do.
     */
    @Override
    public final int hashCode() {
//        return this.name.hashCode() + 57 + this.bodyType.hashCode();
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyTypes + ", " + this.orbitalPeriod;
    }

//*********************************************************************************************************************************************************************//

    public static final class Key {
        private String name;
        private BodyTypes bodyTypes;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return (this.bodyTypes == key.getBodyTypes());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}