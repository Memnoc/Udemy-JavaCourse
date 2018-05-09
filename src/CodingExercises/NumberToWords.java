package CodingExercises;

public class NumberToWords {

    public static void main(String[] args) {

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(1));
//
//        System.out.println(numberToWords(123));
//        System.out.println(numberToWords(10));
//        System.out.println(numberToWords(1000));
//        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(101));

    }

    public static int numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        int counter = getDigitCount(number);
        int counterReversed = getDigitCount(reversed);

        while (reversed >= 1) {
            int lastDigit = reversed % 10;
            reversed /= 10;
            switch (lastDigit) {
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
        for (int difference = counter - counterReversed; difference > 0; difference--) {
            System.out.println("Zero");
        }

        return -1;
    }

    public static int reverse(int value) {
        int resultNumber = 0;
        for (int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;

        }
        return resultNumber;
    }

    public static int getDigitCount(int num){
        int count = 0;
        if(num < 0)
            return -1;
        while(num >= 10){
            count++;
            num /= 10;

        }
        count ++;
        return count;
    }
}

/*GORAN solutions to getDigitCount method


1 -

public static int getDigitCount(int num){
    if(num < 0) {
        return -1;
    }

    int count = 1;   // starting from 1 since min digits in number is 1

    while(num >= 10){
        count++;
        num /= 10;

    }
    return count;
}
Last count ++ looks confusing it is hard to guess why it is there and what it does.


2 -
Another a bit longer solution using for loop could be this

public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }


        int count = 0;

        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied is the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }

        return count;
    }
 */





