package CodingExercises;

public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(100));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(1));
        System.out.println(reverse(100));

//        System.out.println(numberToWords(1235567));
//        System.out.println(numberToWords(1010));
//        System.out.println(numberToWords(1000));
//        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(100));

    }

    public static String numberToWords(int number) {
        int numberReversed = reverse(number);
        int countNumber = getDigitCount(number);
        int countReverse = getDigitCount(numberReversed);

        StringBuilder str = new StringBuilder("");
        while (numberReversed >= 1) {
            int lastDigit = numberReversed % 10;
            numberReversed /= 10;
            switch (lastDigit) {
                case 0:
                    str.append("Zero\n");
                    break;
                case 1:
                    str.append("One\n");
                    break;
                case 2:
                    str.append("Two\n");
                    break;
                case 3:
                    str.append("Three\n");
                    break;
                case 4:
                    str.append("Four\n");
                    break;
                case 5:
                    str.append("Five\n");
                    break;
                case 6:
                    str.append("Six\n");
                    break;
                case 7:
                    str.append("Seven\n");
                    break;
                case 8:
                    str.append("Eight\n");
                    break;
                case 9:
                    str.append("Nine\n");
                    break;
            }
            System.out.println(String.valueOf(str));
            for (int difference = countNumber - countReverse; difference > 0; difference--) {
                System.out.println("Zero");
            }

        }

        return null;
    }


    public static int reverse(int value) {
        int resultNumber = 0;
        for (int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;

        }
        return resultNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return - 1;
        return String.valueOf(number).length();
    }


}





