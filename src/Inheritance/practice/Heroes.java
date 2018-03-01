package Inheritance.practice;

public class Heroes extends Human {

    private boolean canSuperRun;
    private boolean canFly;
    private long heroKi;

    private String name;
    private String secretIdentity;
    private String secretMove;

    public Heroes(int eyes, int hears, int arms, int legs, int brain, boolean superRun, boolean fly, int ki, String name, String secretIdentity, String secretMove) {
        super(eyes, hears, arms, legs, brain);
        this.canSuperRun = superRun;
        this.canFly = fly;
        this.heroKi = ki;
        this.name = name;
        this.secretIdentity = secretIdentity;
        this.secretMove = secretMove;
    }

    public void fly () {
        this.name = name;
        System.out.println("The hero " + name + " can fly!");

    }

    public void powerUp (long kiLevel) {
        this.name = name;
        this.heroKi = kiLevel;
        System.out.println("The hero " + name + " is powering up!! " + " and the ki level is over " + kiLevel);
        kiLevel = 0;

    }
}
