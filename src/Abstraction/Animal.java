package Abstraction;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // methods are declared but not implemented
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}