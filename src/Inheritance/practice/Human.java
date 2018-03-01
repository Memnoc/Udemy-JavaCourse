package Inheritance.practice;

public class Human {

    private int eyes;
    private int hears;
    private int arms;
    private int legs;
    private int brain;

    public Human(int eyes, int hears, int arms, int legs, int brain) {
        this.eyes = eyes;
        this.hears = hears;
        this.arms = arms;
        this.legs = legs;
        this.brain = brain;
    }

    public int getEyes() {
        return eyes;
    }

    public int getHears() {
        return hears;
    }

    public int getArms() {
        System.out.println("The human has " + arms + " arms");
        return arms;
    }

    public int getLegs() {
        return legs;
    }

    public int getBrain() {
        return brain;
    }

    public void walk () {
        System.out.println("Human.walk() called ");

    }

    public void eat () {
        System.out.println("Human.eat() called ");

    }

    public void run () {
        System.out.println("Human.run() called ");

    }

    public void think () {
        System.out.println("Human.think() called ");

    }

    public void sleep () {
        System.out.println("Human.sleep() called ");

    }
}
