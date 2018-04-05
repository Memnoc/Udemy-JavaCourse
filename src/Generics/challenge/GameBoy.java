package Generics.challenge;

public class GameBoy extends Game implements Comparable<GameBoy> {
    public GameBoy(String model) {
        super(model);
    }

    @Override
    public int compareTo(GameBoy o) {
        return 0;
    }
}
