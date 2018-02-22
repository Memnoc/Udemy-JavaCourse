package primitveTypes;

public class Strings {

    public static void main(String[] args) {

        // A string is a sequence of characters
        // Arguably the most commonly used data type
        // However, String is not a data type, it's a Class.
        // Java made it easy to use it sort of like a data type

        String myString = "This is a string";
        System.out.println("myString id equal to " + myString);
        myString = myString + " and some more text";
        System.out.println(myString);
        myString = myString + "\u00A9 2015";
        System.out.println(myString);

        // You cannot sum numbers with strings, you can only chain strings
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Result is " + numberString);

        // Same as above, you can only chain strings
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

    }
}
