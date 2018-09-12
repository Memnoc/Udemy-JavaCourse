package CodingExercises;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(22, 23, 34));
        System.out.println(hasSameLastDigit(19, 99, 999));

    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        int firstLastDigit = numberOne % 10;
        int secondLastDigit = numberTwo % 10;
        int thirdLastDigit = numberThree % 10;
        if ((numberOne < 10) || (numberOne > 1000) || (numberTwo < 10) || (numberTwo > 1000) || (numberThree < 10) || (numberThree > 1000)) {
            return false;
        } else {
            return firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || (secondLastDigit == thirdLastDigit);
        }
    }
}