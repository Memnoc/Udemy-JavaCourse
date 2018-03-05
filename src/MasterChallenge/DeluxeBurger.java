package MasterChallenge;

public class DeluxeBurger extends Hamburger {

    private boolean chipsAndDrink;

    public DeluxeBurger(String mName, String mBreadType, String mMeatType, int mPrice, boolean chipsAndDrink) {
        super(mName, mBreadType, mMeatType, mPrice);
        this.chipsAndDrink = true;
    }
}
