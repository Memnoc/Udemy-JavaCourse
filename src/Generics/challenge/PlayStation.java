package Generics.challenge;

public class PlayStation extends Game implements Comparable<PlayStation> {

    public PlayStation(String model) {
        super(model);
    }

    @Override
    public int compareTo(PlayStation o) {
        return 0;
    }
}
