package CodeBlocks;

// Code Block:
// another structural convention that helps isolating chunks of code
// making it more readable and organized
// an "if statement" with a series of else/if is a perfect example of
// grouping blocks of code into code blocks

public class CodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int bonus = 100;
        int levelCompleted = 5;

        if (score == 5000) {
            System.out.println("Your score was 5000"); // In this case we could delete the {} as we only have one line of code
        }

        // Here we have an example of scope:
        // The code in between {} is called "scope"
        // In short, it's about the accessibility of variables in certain situations
        // or in certain places in the code
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }




    }
}
