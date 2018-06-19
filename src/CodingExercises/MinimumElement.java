package CodingExercises;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Array Size : ");
        int count = scan.nextInt();
        scan.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMinimum = findMin(returnedArray);

        System.out.println("minimum value is: " + returnedMinimum);

    }

    private static int[] readIntegers(int count) {
        int i;
        int arr[] = new int[count];

        System.out.print("Enter Array Elements : ");
        for (i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;

    }

    private static int findMin(int[] arr) {
        int small = arr[0];

        for (int anArr : arr) {
            if (small > anArr) {
                small = anArr;
            }
        }
        return small;
    }
}





