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
    }




}
