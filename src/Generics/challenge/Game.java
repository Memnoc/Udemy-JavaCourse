package Generics.challenge;

public abstract class Game {

    private String gameName;

    public Game(String title) {
        this.gameName = title;
    }

    public String getTitle() {
        return gameName;
    }


    public <T extends Game> int compareToIgnoreCase(T game2) {
        return 0;
    }
}
