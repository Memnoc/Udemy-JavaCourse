package CodingExercises;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }


    public static int getEvenDigitSum(int number) {
        int r, s = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            r = number % 10;
            System.out.println("This is r " + r);
            if (r % 2 == 0) {
                s = s + r;
                System.out.println("This is s " + s);
            }
            number = number / 10;
            System.out.println("This is number " + number);
        }
        return s;
    }
}