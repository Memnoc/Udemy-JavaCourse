package Arrays.ArrayScratchpad;

import java.util.Arrays;

public class ArrayScratchpad {

    public static void main(String[] args) {


        // Defining Arrays Method 1:

        // Declare the array
        // Assign the indexes values in the array, in other words:
        // how many elements the array will contain

        int[] myArray;
        myArray = new int [10];

        double[] myArr2;
        myArr2 = new double[10];

        String[] myArr3;
        myArr3 = new String[5];

        // Defining Arrays Method 2:

        // Same initialization but on one line (recommended)

        int[] myArray4 = new int[10];
        double[] myArray5 = new double[10];
        String[] myArray6 = new String[10];

        // Initialize values into an Array: Method 1

        // Name of the array followed by the index position you want to save the value in
        // followed by the value

        myArray[5] = 1;
        myArr2[6] = 2.0;
        myArr3[1] = "Matteo";
        myArray4[2] = 4;
        myArray5[8] = 5.0;
        myArray6[9] = "John";

        // Initialize values into an Array: Method 2

        // This is called an Array initializer
        // Not only did the initializer assigns values
        // it also tells Java how many position in the indexes the Array will have
        // in this case, 10.
        int[] myArray10 = {1,2,3,4,5,6,7,8,9,10};
        double[] myArray11 = {100.1, 100.2, 100.3, 100.4, 100.5};
        String[] myArray12 = {"Mike", "Chris", "John", "Steve", "Berlusconi"};

        // Initialize values into an Array: Method 3

        // Using a for-loop is the most common way to initialize arrays

        int[] myArray13 = new int[10];
        for (int i = 0; i <10 ; i++) {
            myArray13[i] = i + 1;
            System.out.println(myArray13[i]);

        }

        int[] myArray14 = new int[20];
        for (int i = 10; i <20 ; i++) {
            myArray14[i] = i+1;
            System.out.println(myArray14[i]);

        }

        int[] myArray15 = new int[30];
        for (int i = 20; i <30 ; i++) {
            myArray15[i] = i+1;
            System.out.println(myArray15[i]);

        }

        int[] myArray16 = new int[40];
        for (int i = 30; i < 40; i++) {
            myArray16[i] = i+1;
        }
        for (int i = 30; i <40 ; i++) {
            System.out.println("Element " + i + " has value of " + myArray16[i]);

        }

        int[] myArray17 = new int[11];
        for (int i = 1; i <11 ; i++) {
            myArray17[i] = i*10;
            System.out.println(myArray17[i]);

        }

        // Initialize values into an Array: Method 4

        // Hard-coding the values into the for-loop is note recommende
        // What we can use it's a property called length. which is essentially
        // a field of the Array class that can be used to ensure the loop
        // will go through the whole length of the array.
        // Advantages of using .length
        // Do not have to hard-code the values
        // Can change the values of the array on the fly (i.e number of indexes)
        // without changing the code in the loop.
        // No risk of getting exceptions: ArrayIndexOutOfBounds because you are trying to access
        // an element that is not in the Array

        //int[] myArray18 = new int[30];
        //int[] myArray18 = new int[70];
        int[] myArray18 = new int[10];
        for (int i = 0; i <myArray18.length ; i++) {
            myArray18[i] = i + 1;
            System.out.println("Printing myArray18 " + myArray18[i]);
        }


        // Retrieve a value from an Array:

        System.out.println("The value of this Arrays is: " + myArray[5]);
        System.out.println("The value of this Arrays is: " + myArr2[6]);
        System.out.println("The value of this Arrays is: " + myArr3[1]);
        System.out.println("The value of this Arrays is: " + myArray4[2]);
        System.out.println("The value of this Arrays is: " + myArray5[8]);
        System.out.println("The value of this Arrays is: " + myArray6[9]);
        System.out.println("The value of this Arrays is: " + myArray10[9]);
        System.out.println("The value of this Arrays is: " + myArray10[0]);


        int[] myArray19 = new int[10];
        for (int i = 0; i <myArray19.length ; i++) {
            myArray19[i] = i+1;
        }
        printArray(myArray19);


    }

    // Initialize values into an Array: Method 5

    // As for any variable in Java, you can pass the Array to a method!


    public static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Printing myArray 19 -> Element " + i + ", values is " + array[i]);

        }
    }


}
