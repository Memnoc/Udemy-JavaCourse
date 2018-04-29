package If_Else_Methods_recap;

public class Chart {

    private String playerName;
    private int playerScore;
    private int playerPosition;

//    1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases


    public Chart() {

    }

    public void calculateScore (int score, String name) {
        this.playerScore = score;
        this.playerName = name;
        if (score >= 1000) {
            this.playerPosition = 1;
            System.out.println("The player " + name + " managed to get to " + this.playerPosition + " position position on the high score chart");
        } else if ((score >=500) && (score <1000)) {
            this.playerPosition = 2;
            System.out.println("The player " + name + " managed to get to " + this.playerPosition + " position position on the high score chart");
        } else if ((score >=100) && (score <500)) {
            this.playerPosition = 3;
            System.out.println("The player " + name + " managed to get to " + this.playerPosition + " position on the high score chart");
    } else {
            this.playerPosition = 4;
            System.out.println("The player " + name + " managed to get to " + this.playerPosition + " position position on the high score chart");
        }
    }
}
