package EncapuslationRecap;

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    public boolean duplex = false;

    public Printer(int tonerLevel, int numberOfPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.duplex = duplex;
    }

    public int chargeToner(int charge) {
        if (charge <= 100 && charge > 0) {
            if ((this.tonerLevel + charge <= 100)) {
                return this.tonerLevel += charge;
            } else {
                this.tonerLevel = -1;
                System.out.println("Error");
            }
        }
        return -1;
    }



    public int printing (int pages){
        if (this.duplex) {
            return this.numberOfPages += pages / 2;
        } else {
            return this.numberOfPages += pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
