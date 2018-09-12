package CodingExercises;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(1, 30));

    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if ((a == 0 || a < 10 || b < 10))
            return -1;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}



