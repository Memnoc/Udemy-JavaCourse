package CodingExercises;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.0, -3.0));

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -33.1756));

    }

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        return (long)(numOne * 1000) == (long)(numTwo * 1000);
    }
}
