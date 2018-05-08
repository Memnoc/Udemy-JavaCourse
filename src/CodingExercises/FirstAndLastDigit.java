package CodingExercises;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(357));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

        System.out.println(123 % 10);
        System.out.println(123 / 10);

    }
    public static int sumFirstAndLastDigit(int number){
        if (number <0) {
            return -1;
        }
        int lastDigit = number % 10;

        while (number >= 10){
            number = number / 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }

}
