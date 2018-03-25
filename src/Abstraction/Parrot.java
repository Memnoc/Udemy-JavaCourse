package Abstraction;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Fitting from branch to branch");
    }


}
