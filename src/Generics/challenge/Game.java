package Generics.challenge;

public abstract class Game {

    private String gameName;

    public Game(String title) {
        this.gameName = title;
    }

    public String getTitle() {
        return gameName;
    }


}
