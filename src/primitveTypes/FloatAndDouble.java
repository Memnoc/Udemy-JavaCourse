package primitveTypes;

public class FloatAndDouble {

    // Two data types in Java to deal with decimal numbers: Float and Double.
    // Float is a single precision point
    // Double is a double precision point

    public static void main(String[] args) {

        // int has a width of 32 (4 bytes)
        int myIntValue = 5 / 2; // rounded to 2
        // Float has a width of 32 (4 bytes)
        float myFloatValue = 5f / 3; // correct to 1.6666666 - 7 decimal digits of precision
        // Double has a width of 64 (8 bytes)
        // Double is the best choice when dealing with decimal numbers
        // a) Double is more precise
        // b) It's much faster than Float in compiling
        // c) A lot of built-in methods in Java use Double as data type
        double myDoubleValue = 5d / 3; // correct to 2.5 - 16 decimal digits of precision

        System.out.println("myIntValue :" + myIntValue);
        System.out.println("myFloatValue :" + myFloatValue);
        System.out.println("myDoubleValue :" + myDoubleValue);

    }
}
