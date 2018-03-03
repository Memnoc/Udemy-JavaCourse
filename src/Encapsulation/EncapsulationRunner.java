package Encapsulation;

public class EncapsulationRunner {

    public static void main(String[] args) {

//        // Accessing the non-encapsulated class and its constructor
//        Player player = new Player();
//        player.name = "Matteo";
//        player.hitPoints = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining hitPoints = " + player.healthRemaining());
//
//        damage = 11;
//        player.hitPoints = 100; // Here we are taking over what's established in the Player.class making our own rules (bad bad)
//        player.loseHealth(damage);
//        System.out.println("Remaining hitPoints = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Matteo", 50, "Sword");
        System.out.println("Initial hitPoints is " + enhancedPlayer.getHealth());

    }
}
