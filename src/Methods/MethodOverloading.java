package Methods;

// Method overloading is the option where you can use the same method name with different parameters
// Overloading a method means using a different signature, same name, but different parameters.

public abstract class MethodOverloading {



    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Player " + " scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score");
        return  0;
    }

}
