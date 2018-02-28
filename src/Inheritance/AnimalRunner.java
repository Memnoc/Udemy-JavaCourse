package Inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        // Creating an object for the Inheritance class
        Animal animal = new Animal(1,1,5,5, "Inheritance");

        // Creating an object for the Dog class
        Dog dog = new Dog(20, 8, "Yorkie", 4, 1, 1, 20, "long silky");
        //dog.eat(); // inheritance made this method from Inheritance accessible here
        dog.walk();
        //dog.run();
    }
}
