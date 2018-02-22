package Methods;

// Create a method called displayHighScorePosition
// It should take a playerName as parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position" and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an int
// the return data should be:
// 1 if the score is > 1000
// 2 if the score is > 500 and < 1000
// 3 if the score is > 100 and < 500
// 4 in all other cases
// call both methods and display the result of the following
// a score of 1500, 900, 400 and 50

public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = displayHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition);

        highScorePosition = displayHighScorePosition(900);
        displayHighScore("Mark", highScorePosition);

        highScorePosition = displayHighScorePosition(400);
        displayHighScore("Julian", highScorePosition);

        highScorePosition = displayHighScorePosition(50);
        displayHighScore("Holly", highScorePosition);


    }

    public static void displayHighScore (String name, int position) {
        System.out.println("The player " + name + " managed to get into" + position);
    }

    public static int displayHighScorePosition ( int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return  3;
        } else {
            return 4;
        }

    }
}
