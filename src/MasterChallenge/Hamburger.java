package MasterChallenge;

// This is the classic hamburger

public class Hamburger {

    private String mName;
    private String mBreadType;
    private String mMeatType;
    private double mPrice;
    private boolean mHasLettuce;
    private boolean mHasTomatoes;
    private boolean mHasOnions;
    private boolean mHasCarrots;

    public Hamburger(String mName, String mBreadType, String mMeatType, double mPrice) {
        this.mName = mName;
        this.mBreadType = mBreadType;
        this.mMeatType = mMeatType;
        this.mPrice = mPrice;
    }

    int menu = 0;

    public double additions(int menu) {
        double lettuce = 0;
        double carrots  =0;
        double onions = 0;
        double tomatoes = 0;
        switch (menu) {
            case 1:
                menu = 1;
                lettuce = 1.0;
                double menu1 = (int) (this.mPrice + lettuce);
                System.out.println("you have selected: " + lettuce + " your total is " + menu1 + " Would you like any extra?");
                return menu1;
            case 2:
                menu = 2;
                carrots = 1.0;
                double menu2 = (int) (this.mPrice + lettuce + carrots);
                System.out.println("you have selected: " + lettuce + carrots + " your total is" + menu2 + " Would you like any extra?");
                return menu2;
            case 3:
                menu = 3;
                double menu3 = (int) (this.mPrice + lettuce + carrots + onions);
                System.out.println("you have selected: " + lettuce + carrots + onions + " your total is" + menu3 + " Would you like any extra?");
                return menu3;
            case 4:
                menu = 4;
                double menu4 = (int) (this.mPrice + lettuce + carrots + onions + tomatoes);
                System.out.println("you have selected: " + lettuce + carrots + onions + tomatoes + " your total is" + menu4 + " Would you like any extra?");
                return menu4;
                default:
                    System.out.println("You don't want any extra.");
                    return menu;

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

    public boolean ismHasLettuce() {
        return mHasLettuce;
    }

    public boolean ismHasTomatoes() {
        return mHasTomatoes;
    }

    public boolean ismHasOnions() {
        return mHasOnions;
    }

    public boolean ismHasCarrots() {
        return mHasCarrots;
    }
}
