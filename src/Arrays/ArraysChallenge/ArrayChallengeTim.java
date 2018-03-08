package Arrays.ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeTim {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers( myIntegers );
        printArray( sorted );

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Element " + i + " contents " + array[i]);

        }

    }

    public static int[] sortIntegers (int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i <array.length ; i++) {
//            sortedArray[i] = array[i];
//
//        }
        int[] sortedArray = Arrays.copyOf( array, array.length ); // the code commented above can be replaced by using a built-in method
        // The method effectively takes a copy of the array with array.length and stores it in sortedAtrray
        boolean flag = true;
        int temp;
        while (flag) { // the while is gonna continue until flag is true
            flag = false; // loop escape
            for (int i = 0; i <sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){ // Logic is: if item in index 0 is smaller than item in index0+1[i+1]
                    temp = sortedArray[i]; // store the current array in a temp variable
                    sortedArray[i] = sortedArray[i+1]; // move the [i+1] to the current array
                    sortedArray[i+1] = temp; //assign the [i+1] to the temp variable
                    flag = true; // set the flag back to true so the loop can continue
                }

            }
        }
        return sortedArray;
    }
}
