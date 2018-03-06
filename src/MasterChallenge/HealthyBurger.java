package MasterChallenge;

public class HealthyBurger extends Hamburger {

    private boolean mHasMayo;
    private boolean mHasPickles;
    private double mHealthyBurgerPrice;
    private double mHealthyExtrasPrice;


    public HealthyBurger(String mName, String mBreadType, String mMeatType, double mPrice, boolean mHasMayo, boolean mHasPickles) {
        super(mName, mBreadType, mMeatType, mPrice);
        this.mHasMayo = false;
        this.mHasPickles = false;
        this.mHealthyBurgerPrice = mPrice;
    }

    public void extraAdditions(String extras) {
        switch (extras) {
            case "Mayo":
                this.mHealthyBurgerPrice = getmPrice();
                double mayo = this.mHealthyBurgerPrice += 1;
                System.out.println("You have selected mayo as additional extra for, which is 1.0 extra dollar. Your total is " + mayo + " dollars. Would you like any extra?");
                break;
            case "Pickles":
                double pickles = this.mHealthyBurgerPrice += 1;
                System.out.println("You have selected pickles as additional extra for, which is 1.0 extra dollar. Your total is " + pickles + " dollars. Would you like any extra?");
                break;
                default:
                    System.out.println("No special extras for you!");


        }

    }


    public double getmHealthyExtrasPrice() {
        return mHealthyExtrasPrice;
    }

    public double getmHealthyBurgerPrice() {
        return mHealthyBurgerPrice;
    }
}
