package primitveTypes.Challenges;

// Convert a given number of pounds to kilograms
// 1. Create a variable to store the number of pounds
// 2. Calculate the number of kg for the number above and store in a variable
// 3. Print out the result.
//
// NOTES: 1 pound is equal to 0.45359237

public class ChallengeFloatAndDouble {

    public static void main(String[] args) {

        int numPounds = 10;
        double oneKg = 0.45359237d;

        double kgInPound = numPounds * oneKg;
        System.out.println(kgInPound);


    }
}
