package SetandHashSet.SetChallenge;

import java.util.HashSet;
import java.util.Set;


public class HeavenlyBody {
    private final String name;
    private final String type;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Set<HeavenlyBody> bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, String type) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = new HashSet<>();
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    // Returning new HashSet of satellites
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // Returning new HashSet of bodyTypes
    public Set<HeavenlyBody> getBodyType() {
        return new HashSet<>(this.bodyType);
    }

    // adding moons
    public boolean addMoon(HeavenlyBody moon) {
        return  this.satellites.add(moon);
    }

    // adding body types
    public boolean addBodyType(HeavenlyBody bodyType) {
        return  this.bodyType.add(bodyType);
    }

    @Override
    public String toString() {
        return this.name + ": " + this.type + ", "+ this.orbitalPeriod;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objType = ((HeavenlyBody) obj).getType();
        return this.type.equals(objType);
    }

    // equals doc's:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-

    @Override
    public final int hashCode() {
//        System.out.println("hashCode called");
        return this.name.hashCode() + 57;
    }
}