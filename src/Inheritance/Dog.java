package Inheritance;

// "super" here means calling the constructor from the class we are inheriting from
// You don't have to necessarily repeat all the fields in the Dog constructor from the Inheritance class,
// You can remove the fields from the constructor signature and initialize them in the super() call
// Similarly, you can initialize more fields following the pattern this.mField = field;

public class Dog extends Animal {

    private int mEyes;
    private int mLegs;
    private int mTale;
    private int mTeeth;
    private String mCoat;


    public Dog(int mWeight, int mSize, String mName, int eyes, int legs, int tile, int teeth, String coat) {
        super(1, 1, mWeight, mSize, mName);
        this.mEyes = eyes;
        this.mCoat = coat;
        this.mLegs = legs;
        this.mTale = tile;
        this.mTeeth = teeth;

    }

    private void chew () {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dpg.eat() call");
        chew();
        super.eat();
    }

    public void walk () {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run () {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called from override");
        moveLegs(speed);
        super.move(speed);
    }
}
