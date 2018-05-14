package ArraysRecap;

import java.util.Arrays;

public class ScratchPad {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("========Single dimension===========================================================================================================================================================================================================================================");

        int[] randomArray;
        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"just", "random", "words"};
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        int k = 1;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=======Multi-dimensional============================================================================================================================================================================================================================================");



        // Multi-dimensional

        String[][] multiArray = new String[10][10];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;

            }
        }
        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
            System.out.println();

            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {

                    System.out.print("| " + multiArray[i][j] + " ");
                }
            }
        }

        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====With enhanced For-Loop==============================================================================================================================================================================================================================================");

        for(int row : numberArray){
            System.out.print(row);
        }
        System.out.println("\n");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Multi-dimensional with enhanced For-Loop==============================================================================================================================================================================================================================================");
        /* Pattern for the enhanced for loop

        for(dataType[] varForRow : arrayName)
         */

        for (String[] rows : multiArray){
            for(String column : rows){
                System.out.print("| " + column + " ");

            }
            System.out.println("|");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Copying the Array==============================================================================================================================================================================================================================================");


        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        for (int row : numberCopy){
            System.out.print(row);
        }
        System.out.println("\n");


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Copying the Array in a range==============================================================================================================================================================================================================================================");

        int[] numberCopyRange = Arrays.copyOfRange(numberArray, 3, 6);
        for (int row : numberCopyRange){
            System.out.print(row);
        }
        System.out.println("\n");


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Print out the whole Array==============================================================================================================================================================================================================================================");

        System.out.println(Arrays.toString(numberArray));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Fill the Array==============================================================================================================================================================================================================================================");

        int[] arrayFill = new int[100];
        Arrays.fill(arrayFill, 2);
        System.out.println(Arrays.toString(arrayFill));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Board Game==============================================================================================================================================================================================================================================");

        char[][] boardGame = new char[10][10];
        for (char[] row : boardGame) {
            Arrays.fill(row, '*');
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Sort Array (ascending)==============================================================================================================================================================================================================================================");

        int[] toSort = new int[10];

        for (int i = 0; i < 10; i++) {

            toSort[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====Binary Search==============================================================================================================================================================================================================================================");

        int whereIas50 = Arrays.binarySearch(toSort, 1);
        System.out.println(whereIas50);

    }

}
