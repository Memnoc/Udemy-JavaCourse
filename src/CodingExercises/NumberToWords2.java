package CodingExercises;

public class NumberToWords2 {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-2));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(1));
        //System.out.println(reverse(100));

//        System.out.println(numberToWords(1235567));
//        System.out.println(numberToWords(1010));
//        System.out.println(numberToWords(1000));
//        System.out.println(numberToWords(-12));
        numberToWords(10);

    }
    public static void numberToWords(int num){
        int numCount = getDigitCount(num);
        int realNum = reverse(num);
        int revCount = getDigitCount(realNum);

        if(num < 0)
            System.out.println("Invalid Value");
        while (realNum >= 1){
            int lastDigit = realNum % 10;
            realNum /= 10;
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
            for(int deficit = numCount - revCount; deficit > 0; deficit--){
                System.out.println("Zero");
            }
        }


    public static int reverse(int value) {
        int resultNumber = 0;
        for (int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;

        }
        return resultNumber;
    }

    // This method will give the number of digits in a given number
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
