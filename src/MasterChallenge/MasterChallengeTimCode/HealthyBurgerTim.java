package MasterChallenge.MasterChallengeTimCode;

public class HealthyBurgerTim extends HamburgerTim {

    private String mHealthyExtra1Name;
    private double mHealthyExtra1Price;

    private String mHealthyExtra2Name;
    private double mHealthyExtra2Price;


    public HealthyBurgerTim(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.mHealthyExtra1Name = name;
        this.mHealthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.mHealthyExtra2Name = name;
        this.mHealthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if (this.mHealthyExtra1Name != null) {
            hamburgerPrice += this.mHealthyExtra1Price;
            System.out.println("Added " + this.mHealthyExtra1Name + " for an extra " + this.mHealthyExtra1Price);
        }

        if (this.mHealthyExtra2Name != null) {
            hamburgerPrice += this.mHealthyExtra2Price;
            System.out.println("Added " + this.mHealthyExtra2Name + " for an extra " + this.mHealthyExtra2Price);
        }
        return hamburgerPrice;
    }
}

