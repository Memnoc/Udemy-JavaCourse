package MasterChallenge.MasterChallengeTimCode;


public class MasterChallengeRunnerTim {

    public static void main(String[] args) {
        HamburgerTim hamburgerTim = new HamburgerTim("Basic", "sausage", 3.56, "White");
        double price = hamburgerTim.itemizeHamburger();
        hamburgerTim.addHamburgerAddition1("tomatoes", 0.27);
        hamburgerTim.addHamburgerAddition2("lettuce", 0.75);
        hamburgerTim.addHamburgerAddition3("lettuce", 1.12);
        System.out.println("Total Burger price is " + hamburgerTim.itemizeHamburger());

        HealthyBurgerTim healthyBurgerTim = new HealthyBurgerTim("bacon", 5.67);
        healthyBurgerTim.addHamburgerAddition1("egg", 5.43);
        healthyBurgerTim.addHealthAddition1("lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurgerTim.itemizeHamburger());

        DeluxeBurgerTim deluxeBurgerTim = new DeluxeBurgerTim();
        deluxeBurgerTim.itemizeHamburger();
    }
}
