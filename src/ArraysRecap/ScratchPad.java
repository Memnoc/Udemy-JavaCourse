package ArraysRecap;

public class ScratchPad {

    public static void main(String[] args) {

        // Single dimension array
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        // Multi-dimensional Array

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;

            }

        }
        int k = 1;
        while (k <= 61) {
            System.out.println('-');
            k++;
            System.out.println();

            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    System.out.println("| " + multiArray[i][j] + " ");

                }

            }
        }
        k = 1;
        while (k <= 61) {
            System.out.println('-');
        }
    }
}
