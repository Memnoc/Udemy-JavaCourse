package Operators.challenges;

// 1. Create a double variable with the value 20
// 2. Create a second variable of type double with the value 80
// 3. Add both numbers up and multiply by 25
// 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
// 5. Write an "if statement" that displays a message "Total was over the limit"
// if the remainder total (#4) is equal to 20 or less.

public class OperatorsChallenge {

    public static void main(String[] args) {

        double myDouble = 20d;
        double myDouble2 = 80d;
        double myDoubleTotal = (myDouble + myDouble2) * 25d;
        System.out.println("My total = " + myDoubleTotal);
        double myDoubleRemainder = myDoubleTotal % 40;
        if (myDoubleRemainder <= 20)
        System.out.println("Total was over the limit");

        // Java operator precedence table: http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html


    }
}
