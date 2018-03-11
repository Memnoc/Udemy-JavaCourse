// This is a program that shows a real-life example of an Array in use
// It's gonna take input from the user
// It's gonna sum up the input (numbers)
// It's gonna calculate the average for the numbers provided

package Arrays.ArrayScratchpad;


import java.util.Scanner;

public class AverageCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myNum = getSum(5);
        for (int i = 0; i <myNum.length ; i++) {
            System.out.println("Element " + i + " typed value was " + myNum[i]);

        }
        System.out.println("Average is " + getAverage(myNum));
    }

    public static int[] getSum(int number){
        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];
        for (int i = 0; i <values.length ; i++) {
            values[i] =+ scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }



}
