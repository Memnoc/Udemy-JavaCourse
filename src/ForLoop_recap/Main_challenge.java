package ForLoop_recap;

//	    int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100) {
//                break;
//            }
//
//        } while(count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found


// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

public class Main_challenge {

    private static boolean isEvenNumber = false;

    public static void main(String[] args) {

        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);

        int number = 5;
        int counter = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (! isEvenNumber(number)) {
                continue;
            }
            counter++;
            if (counter >= 5) {
                break;
            }

            System.out.println("Even number " + number);
            number++;
        }
        System.out.println("Total even number found " + counter);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            System.out.println(number + " is an even number");
        }
        return true;
    }

}
