package Arrays;

import java.util.Scanner;

public class ArrayRunner {
// Creating an object for the Scanner class that will allow to input text from the console
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//
//          int[] myVar;
//          myVar = new int[10];
//          OR
//          int[] myVar2 = new int[10];
//          myVar2[5] = 50; //one value declaration
//          int[]myVar = {1,2,3,4,5,6,7,8}; // multiple value declaration
//          System.out.println(myVar[3]);
//          System.out.println(myVar[6]);
//          System.out.println(myVar[2]);
//
//        int[] myVar4 = new int[25];
//        You can omit indicating the length of the array using the built-in property arrayName.length
//        for (int i = 0; i < myVar4.length; i++) {
//            myVar4[i] = i*10;
//        }
//        printArray(myVar4);
//
//    }
//
//       Very useful to put the foor loop in a method
//       and pass the array as a parameter
//       then call the arrayName as printArray(myVar4);
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//
//        }

//         Real life use of Arrays:
//         We are gonna create a small program that will
//         allow the user to type some numbers, and then
//         we are gonna sum up those numbers and return
//         the average.
        int[] myInteger = getIntegers(5);
        for (int i = 0; i <myInteger.length ; i++) {
            System.out.println("Element " + i + ", typed value was " + myInteger[i]);
        }

        System.out.println("The average is " + getAverage(myInteger));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i <values.length ; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i <array.length ; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }
}
