package primitveTypes.Challenges;

public class ChallengePrimitives {

    // 1. Create a byte variable and set it to any valid byte number
    // 2. Create a short variable and set it to any short number
    // 3. Create a int variable and set it to any valid int number
    // 4. Create a variable of type long, and make it equal to
    // 50000 +10 times the sum of the byte, plus the short plus the int

    public static void main(String[] args) {

        byte myByte = 10;

        short myShort = 20;

        int myInt = 50;

        long myTotal = (myByte + myShort + myInt) * 10;

        long myLong = (50000L + myTotal);

        System.out.println(myLong);

    }
}
