package MasterChallenge.MasterChallengeTimCode;

public class HamburgerTim {
    private String mName;
    private String mMeat;
    private double mPrice;
    private String mBreadRollType;

    private String mAddition1Name;
    private double mAddition1Price;

    private String mAddition2Name;
    private double mAddition2Price;

    private String mAddition3Name;
    private double mAddition3Price;

    private String mAddition4Name;
    private double mAddition4Price;


    public HamburgerTim(String name, String meat, double price, String breadRollType) {
        mName = name;
        mMeat = meat;
        mPrice = price;
        mBreadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.mAddition1Name = name;
        this.mAddition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.mAddition2Name = name;
        this.mAddition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.mAddition3Name = name;
        this.mAddition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.mAddition4Name = name;
        this.mAddition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.mPrice;
        System.out.println(this.mName + " hamburger " + " on a " + this.mBreadRollType + " roll "
              + "with " + this.mMeat + ", price is " + this.mPrice);
        if (this.mAddition1Name != null) {
            hamburgerPrice += this.mAddition1Price;
            System.out.println("Added " + this.mAddition1Name + " for an extra " + this.mAddition1Price);
        }


        if (this.mAddition2Name != null) {
            hamburgerPrice += this.mAddition1Price;
            System.out.println("Added " + this.mAddition2Name + " for an extra " + this.mAddition2Price);
        }


        if (this.mAddition3Name != null) {
            hamburgerPrice += this.mAddition3Price;
            System.out.println("Added " + this.mAddition3Name + " for an extra " + this.mAddition3Price);
        }

        if (this.mAddition4Name != null) {
            hamburgerPrice += this.mAddition4Price;
            System.out.println("Added " + this.mAddition4Name + " for an extra " + this.mAddition4Price);
        }

        return hamburgerPrice;
    }
}
