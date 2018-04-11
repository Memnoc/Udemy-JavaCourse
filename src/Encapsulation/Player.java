package Encapsulation;

// This class is public, or better, it has a public scope and it's not using encapsulation
// This means that any class can access the member variables

public class Player {

    public String name;
    public int hitPoints;
    public String weapon;

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Warrior knocked out");
        }

    }

    public int healthRemaining() {
        return this.hitPoints;
    }
}
