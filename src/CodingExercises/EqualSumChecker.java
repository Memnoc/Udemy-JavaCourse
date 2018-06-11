package CodingExercises;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));


    }

    private static boolean hasEqualSum (int numberOne, int two, int three) {
        return numberOne + two == three;
    }
}
