package MasterChallenge;

class DeluxeBurger extends Hamburger {

    private boolean chipsAndDrink;
    private double deluxeBurgerPrice;


    DeluxeBurger(String mName, String mBreadType, String mMeatType, double mPrice, boolean chipsAndDrink) {
        super(mName, mBreadType, mMeatType, mPrice);
        this.chipsAndDrink = true;
        this.deluxeBurgerPrice =  mPrice;
    }

    public double getDeluxeBurgerPrice() {
        return deluxeBurgerPrice;
    }

    @Override
    public void additions(String extra, double extraPrice) {
        System.out.println("You cannot add extras to the Deluxe Burgers!");
    }
}
