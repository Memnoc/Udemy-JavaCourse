package MasterChallenge;

// This is the classic hamburger

public class Hamburger {

    private String mName;
    private String mBreadType;
    private String mMeatType;
    private double mPrice;
    private String mLettuce;
    private String mTomatoes;
    private String mOnions;
    private String mCarrots;

    Hamburger(String mName, String mBreadType, String mMeatType, double mPrice) {
        this.mName = mName;
        this.mBreadType = mBreadType;
        this.mMeatType = mMeatType;
        this.mPrice = mPrice;
    }



    String extra = "";

    private Hamburger() {

    }

    public void additions(String extra, double extraPrice) {
        switch (extra) {
            case "Lettuce":
                double lettuce = (this.mPrice += extraPrice);
                System.out.println("You have selected lettuce for " + extraPrice + "extra dollar. Your total is " + lettuce + " dollars. Would you like any extra?");
                break;
            case "Carrots":
                double carrots = (this.mPrice += extraPrice);
                System.out.println("You have selected lettuce for " + extraPrice + "extra dollar. Your total is " + carrots + " dollars. Would you like any extra?");
                break;
            case "Onions":
                double onions = (this.mPrice += extraPrice);
                System.out.println("You have selected lettuce for " + extraPrice + "extra dollar. Your total is " + onions + " dollars. Would you like any extra?");
                break;
            case "Tomatoes":
                double tomatoes = (this.mPrice += extraPrice);
                System.out.println("You have selected lettuce for " + extraPrice + "extra dollar. Your total is " + tomatoes + " dollars. Would you like any extra?");
                break;
            case "AllClassic":
                double all = (this.mPrice += 4);
                System.out.println("You have selected all the extras, which is four extra dollar. Your total is " + all + " dollars. Enjoy!!");
                break;
            case "Deluxe":
                System.out.println("Oops! You cannot add any extra to the Deluxe Combo!");
                break;
                default:
                    System.out.println("You don't want any extra.");
                    break;

        }


    }




    public String getmName() {
        return mName;
    }

    public String getmBreadType() {
        return mBreadType;
    }

    public String getmMeatType() {
        return mMeatType;
    }

    public double getmPrice() {
        return mPrice;
    }

    public String getLettuce() {
        return mLettuce;
    }

    public String getTomatoes() {
        return mTomatoes;
    }

    public String getOnions() {
        return mOnions;
    }

    public String getCarrots() {
        return mCarrots;
    }
}
