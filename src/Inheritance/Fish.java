package Inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int mBrain, int mBody, int mWeight, int mSize, String mName, int gills, int eyes, int fins) {

        super(mBrain, mBody, mWeight, mSize, mName);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest () {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }



    private void swim (int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}
