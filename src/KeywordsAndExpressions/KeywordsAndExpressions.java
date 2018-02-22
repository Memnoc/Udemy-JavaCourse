package KeywordsAndExpressions;

// Expressions are the building blocks of Java code
// They're built with values, operators and variables but also with method calls

public class KeywordsAndExpressions {

    public static void main(String[] args) {
        // a mile is equal to 1.609344
        // For example, wanting to build an expression that calculates
        // how many km in a mile:
        // In this line, this is the expression: kilometers = (100 * 1.609344);
        // Notice that the data type is not there. If you add that, the line becomes a "statement" (minus the ;)
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        // In this example, this is the expression:
        // highScore == 50
        if (highScore == 50)
            // This "This is an expression" it's also en expression
            System.out.println("This is an expression");

    }
}
