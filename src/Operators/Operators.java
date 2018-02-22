package Operators;

public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2; // <- this is an expression
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 =  " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        result += 2;
        System.out.println("Result is now " + result);

        // Some more complex logic with conditionals
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        int topScore = 90;
        if (topScore == 100)
            System.out.println("You've got the top score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top and less than 100");

        if (topScore > secondTopScore || topScore < 100)
            System.out.println("Greater than second top and less than 100");

        // Check if the value is actually true
        int newValue = 100;
        if (newValue == 100)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("this is not supposed to happen");

        // ternary operator
        // The following reads as:
        // if isCar equals true return true, otherwise return false
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // List of operators form Oracle: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html






    }
}
