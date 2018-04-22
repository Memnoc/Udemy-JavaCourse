package SetandHashSet.challenge;

public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover)); // true
        System.out.println(rover.equals(rover2)); // false

        /*
         * What's happening? Why one equals the other is true, but vice-versa is false?
         * Labrador is an instance of Dog, but Dog is not an instance of Labrador,
         * is an instance of Dog!
         * This violates the symmetric rule of the equals method explained here: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
         * It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
         *
         * To fix this:
         *
         * Best way is avoid overriding the equals method in the Labrador class
         * With that commented out, the code returns true, true.
         *
         * To ensure equals(); cannot be overwritten in other instances of the Dog class,
         * we need to declare the method equals() in the Dog class as final
         *
         * This is to teach and prove a very important point:
         * Great deal of thoughts should be put into allowing your classes to be sub-classed.
         * If you choose to do so, how are you gonna treat comparison between the subclass and it's base class?
         *
         * Golden rule is:
         *
         * If the subclass would reasonably only add methods that do not alter the way
         * that equal() should work, then allow subclassing, but mark your equals() and
         * hashCode() methods as final.
         *
         * If a sub-class is likely to be different a different object, then use the method we
         * have used in the HeavenlyBody class to make comparison between the base class and its
         * subclass.
         *
         * If neither of this would really fit, then prevent sub-classing and force clients to use Composition
         * instead.
         *
         */
    }
}
