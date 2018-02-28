package Inheritance;

public class Animal {

    private int mBrain;
    private int mBody;
    private int mWeight;
    private int mSize;
    private String mName;

    public Animal(int mBrain, int mBody, int mWeight, int mSize, String mName) {
        this.mBrain = mBrain;
        this.mBody = mBody;
        this.mWeight = mWeight;
        this.mSize = mSize;
        this.mName = mName;
    }

    public void eat() {
        System.out.println("Inheritance.eat() called");

    }

    public void move (int speed) {
        System.out.println("Inheritance.move() called " + "Inheritance is moving at " + speed);

    }

    public int getmBrain() {
        return mBrain;
    }

    public int getmBody() {
        return mBody;
    }

    public int getmWeight() {
        return mWeight;
    }

    public int getmSize() {
        return mSize;
    }

    public String getmName() {
        return mName;
    }
}
