package StatementsSpacesIndentation;

// Statement
// do not need to be on one line
// You can have multiple statements on the same line

// White-space:
// it is the concept that describes the space in between elements of your code
// for ex. the space from a data type and a variable
// or between variable name and operators


// Indentation:
// A visual convention to make the code more readable
// option+cmd+L will indent the code nicely and automatically


public class StatementsSpacesIndentation {

    public static void main(String[] args) {
        int myVar = 50; // This is a Java statement int myVar = 50
        myVar++; // statement
        myVar--; // statement
        System.out.println("This is a test"); // this is also a statement
        System.out.println("This is" + // this is also a statement
                "a test");

        int anotherVariable = 50; myVar--; System.out.println("This is anothe one"); // This is technically correct and also 3 statements


    }
}
