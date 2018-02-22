package Methods;

// We are gonna take the code from the CodeBlock Challenge and
// drastically reduce it nby using methods to pass variable around.

// A method is an awesome way to make the code modularized an re-usable
// The most obvious example of method is the Java entry point itself:
// public static void main(String[] args) {}
// Everything in between the {} of this method is the body of the method itself
// A method takes parameters
// When calling the method, those parameters are assigned and they become arguments

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // You can assign a variable to the result of a method:
        int highScore = calculateScore(gameOver, score, bonus, levelCompleted);
        System.out.println("Your final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, bonus, levelCompleted);
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1; // negative one is a convention in programming used to signal an error, invalid value ir value not found.
    }
}
