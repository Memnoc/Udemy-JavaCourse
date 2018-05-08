package CodingExercises;

public class NumberToWords2 {

    public static void main(String[] args) {

        //System.out.println(getDigitCount(100));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(1));
        //System.out.println(reverse(100));

//        System.out.println(numberToWords(1235567));
//        System.out.println(numberToWords(1010));
//        System.out.println(numberToWords(1000));
//        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(1010));

    }
    public static int numberToWords(int number) {
        if (number <0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        int countNumber = getDigitCount(number);
        int countReverse = getDigitCount(reverseNumber);


        int ldigit;
        while (reverseNumber >= 1) {
            ldigit = reverseNumber % 10;
            reverseNumber /= 10;
            switch (ldigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }
        for (int difference = countNumber - countReverse; difference >0 ; difference--){
            System.out.println("Zero");
        }

        return -1;
    }

    public static int reverse(int number) {

        int reverseNumber = 0;
        for (int i = number; i != 0; i /= 10) {
            reverseNumber = reverseNumber * 10 + i % 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int numbre) {
        if (numbre >= 0) {
            int countNumber = 0;
            do {
                countNumber++;
                numbre /= 10;
            } while (numbre > 0);


            return countNumber;
        }
        return -1;
    }
}
