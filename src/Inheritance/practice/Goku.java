package Inheritance.practice;

public class Goku extends Heroes {

    private String heroName;
    private String heroRace;
    private String heroAttack;

    private int heroKiLevel;

    public Goku(String heroName, String heroRace, String heroAttack, int heroKiLevel) {
        super(2, 2, 2, 2, 1, true, true, 0, "Son Goku", "Kakaroth", "KA-ME-HA-ME-HA");
        this.heroName = heroName;
        this.heroRace = heroRace;
        this.heroAttack = heroAttack;
        this.heroKiLevel = heroKiLevel;
    }

    public void bukuJutsu () {
        fly();
    }

    public void superSaiyan(long heroKiLevel) {
        powerUp(heroKiLevel);
        if (heroKiLevel == 0) {
            System.out.println("Raddish will kill you " + this.heroName);
        } else if (heroKiLevel >= 1 && heroKiLevel < 2) {
            System.out.println("You can beat Vegeta!" + this.heroName);
        } else if (heroKiLevel >= 2 && heroKiLevel < 3) {
            System.out.println("Kaioh-ken 10x!!" + this.heroName);
        } else if (heroKiLevel >= 3 && heroKiLevel < 5) {
            System.out.println("Super sayan I!!!" + this.heroName);
        } else {
            System.out.println("The power tool shuttered!");
        }

    }

    public void energyBlast (String energyAttack) {
        this.heroAttack = energyAttack;
        System.out.println(this.heroName + " just launched a " + energyAttack);
    }
}
