package MasterChallenge;

public class HealthyBurger extends Hamburger {

    private boolean mHasMayo;
    private boolean mHasPickles;
    private int mHealthyBurgerPrice;
    private int mHealthyExtrasPrice;


    public HealthyBurger(String mName, String mBreadType, String mMeatType, int mPrice, boolean mHasMayo, boolean mHasPickles) {
        super(mName, mBreadType, mMeatType, mPrice);
        this.mHasMayo = false;
        this.mHasPickles = false;
    }



}
