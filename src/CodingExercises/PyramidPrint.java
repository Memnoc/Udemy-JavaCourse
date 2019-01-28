package CodingExercises;

public class PyramidPrint {

    public static void main(String[] args) {



        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        0
//        0 1
//        0 1 2
//        0 1 2 3
//        0 1 2 3 4

        for (int i = 0; i <=5 ; i++) {
            for (int k = 4; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

 //        1
//        1 2
//       1 2 3
//      1 2 3 4
//     1 2 3 4 5

        for (int i = 0; i <=5 ; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //        0
      //        0 1
    //        0 1 2
  //        0 1 2 3
//        0 1 2 3 4

    }


}
