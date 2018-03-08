// This is a demo program that can resize an Array while preserving the data

package ArrayList;

import java.util.Scanner;

public class ArrayResizeDemo {

    private static Scanner s = new Scanner(System.in); // accept the input
    private static int[] baseData = new int[10]; // basic array with 10 elements

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);

    }

    // get data form the console and save it into the array
    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    // print out the array content
    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Takes a copy of the original array
    // change the size of the original array
    // store it back into the new array
    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }
}
