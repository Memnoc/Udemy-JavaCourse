package Arrays;

public class ArrayRunner {

    public static void main(String[] args) {
        //int[] myVar;
        //myVar = new int[10];
//        OR
//        int[] myVar2 = new int[10];
//        myVar2[5] = 50; //one value declaration
//        int[]myVar = {1,2,3,4,5,6,7,8}; // multiple value declaration
//        System.out.println(myVar[3]);
//        System.out.println(myVar[6]);
//        System.out.println(myVar[2]);
        
        int[] myVar4 = new int[10];
        for (int i = 0; i < 10; i++) {
            myVar4[i] = i*10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myVar4[i]);

        }



    }
}
