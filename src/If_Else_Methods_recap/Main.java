package If_Else_Methods_recap;

// Create a method called displayHighScorePosition
// it should take a player's name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an int
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//


public class Main {


    public static void main(String[] args) {

        // Version 2
        Chart chart = new Chart();
        chart.calculateScore(1500, "Matteo");

        Chart chart2 = new Chart();
        chart.calculateScore(900, "Patrick");

        Chart chart3 = new Chart();
        chart.calculateScore(400, "Mark");

        Chart chart4 = new Chart();
        chart.calculateScore(50, "Jim");

        // Version 1

//        int finalScore = calculateHighScorePosition(1500);
//        displayHighScorePosition("Matteo", finalScore);
//
//        int finalScore2 = calculateHighScorePosition(900);
//        displayHighScorePosition("Patrick", finalScore2);
//
//        int finalScore3 = calculateHighScorePosition(400);
//        displayHighScorePosition("Mark", finalScore3);
//
//        int finalScore4 = calculateHighScorePosition(50);
//        displayHighScorePosition("Jim", finalScore4);


    }

    // Version 1

//    public static void displayHighScorePosition (String name, int position) {
//        System.out.println("The player " + name + " managed to get to position " + position + " on the high score chart");
//    }
//
//    public static int calculateHighScorePosition (int score) {
//        if (score >=1000) {
//            return 1;
//        } else if ((score >=500) && (score <1000)) {
//            return 2;
//        } else if ((score >=100) && (score <500)) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }


}


