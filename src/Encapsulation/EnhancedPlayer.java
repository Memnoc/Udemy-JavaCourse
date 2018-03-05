package Encapsulation;

// This class is instead using Encapsulation, and this allows more control over what can be set from outside the class.
// The if statement in hte constructor, for example, doesn't allow the hitPoints value to be initialized if it's not a reault
// included within 1 and 100

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String wepon;

    public EnhancedPlayer(String name, int health, String wepon) {
        this.name = name;
        if (health >0 && health <=100) {
            this.health = health;
        }
        this.wepon = wepon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }

    }

    public int getHealth() {
        return health;
    }
}
