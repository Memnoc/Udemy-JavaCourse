package Composition.CompositionChallenge;

public class TV {

    private int tvInches;
    private String resolution;

    public TV(int tvInches, String resolution) {
        this.tvInches = tvInches;
        this.resolution = resolution;
    }

    public int getTvInches() {
        return tvInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void tvPosition() {
        System.out.println("The TV is positioned against the wall");
    }
}
