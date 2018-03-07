package Arrays.ArraysChallenge;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Integer[] myArray = getIntegers(5);
        printArrays(myArray);
        sortIntegers(myArray);
        System.out.println(Arrays.toString (myArray));


    }
    // returns an array of entered integers from keyboard
    public static Integer[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        Integer[] values = new Integer[number];
        for (int i = 0; i <values.length ; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }
    // prints out the contents of the array
    private static void printArrays(Integer[] myArray){
        for (int i = 0; i <myArray.length ; i++) {
            System.out.println("Element " + i + ", typed value was " + myArray[i]);

        }

    }
    // sort the array and return a new array containing the sorted numbers
    private static void sortIntegers(Integer[] unsortedArray){
        for (int i = 0; i <unsortedArray.length ; i++) {
            Arrays.sort(unsortedArray, Collections.reverseOrder());
            System.out.println("Element " + i + ", typed value was " + unsortedArray[i]);
        }
    }
}
