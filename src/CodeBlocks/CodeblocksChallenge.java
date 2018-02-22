package CodeBlocks;

// Print out a second score on the screen with the following
// score set to 10000
// levelCompleted set to 8
// bonus set to 200
// BUt make sure the first printout above still displays as well

public class CodeblocksChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        if (gameOver) {
            int finalScore = 800;
            int levelCompleted2 = 5;
            int bonus2 = 100;
            int finalScore2 = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }


    }
}
