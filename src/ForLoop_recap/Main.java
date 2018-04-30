package ForLoop_recap;

// For loop has 3 fundamental parts that can be executed in 4 steps
// int i = 1; it's called the init. It usually initialized a variable to a value
// i <7; It's called "condition" and it determines the breaking point of the loop
// i=i+2 It's called the iterator or iteration steps
//*****OUTPUT*************//
/*
1
3
5
7
 */


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <=7; i=i+2) {
            System.out.println(i);
        }

    }
}
