package CodingExercises;

public class SharedDigits {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }


    public static boolean hasSharedDigit(int one, int two) {
        if ((one >= 10 && one <= 99) && (two >= 10 & two <= 99)) {
            return ((one % 10 == two % 10) || (one / 10 == two % 10) || (one % 10 == two / 10));
        }
        return false;
    }
}
