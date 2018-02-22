public class PrimitiveTypes {

    public static void main(String[] args) {

        // int has a width of 32
        int minValue = -2147483647; // minimum value This is a literal, a fixed value (a + b) is an expression
        int maxValue = 2_147_483_647; // maximum value From Java 7 you can use _ in literals for better readings

        // byte has a width of 8
        byte myBiteValueMin = -128; // minimum
        byte myBiteValueMax = 127; // minimum

        // short has a width of 16
        short myShortMin = -32768; // minimum
        short myShortMax = 32767; // max

        // long has a width of 64
        // Capital L or l would work the same
        long myLongMin = -9_223_372_036_854_775_808L; // minimum
        long myLongMax = 9_223_372_036_854_775_807L; // maximum
    }
}
