package ArraysRecap;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrays  = getIntegers(5);
        int[] sorted = sortIntegers(arrays);
        printArray(sorted);



    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " was " + array[i]);
        }
    }

// Need to write the sortInteger method

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];

        }
        int temp = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}


