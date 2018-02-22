package Methods;

public class MethodChallenge {

    public static void main(String[] args) {





    }

    public static void displayHighScore (String name, int position) {
        System.out.println("The player " + name + " managed to get into" + position);
    }

    public static int displayHighScorePosition ( int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if ((playerScore > 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore > 100) && (playerScore < 500)) {
            return  3;
        } else {
            return 4;
        }

    }
}
