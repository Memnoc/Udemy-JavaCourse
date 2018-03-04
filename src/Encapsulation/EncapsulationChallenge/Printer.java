package Encapsulation.EncapsulationChallenge;

// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {

    private int tonerLevel;
    private boolean duplex;
    private int numPages;

    public Printer(int tonerLevel, boolean duplex) {

        if ((tonerLevel > -1) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.numPages = 0;
    }

    public int fillTonerUp(int level) {
        if (this.tonerLevel + level <= 100){
            this.tonerLevel += level;
            System.out.println("You filled up the toner by  " + level);
            return level;
        } else {
            System.out.println("The toner is at max level! ");
            return -1;
        }

    }


    public void printPage (int printed) {
        this.numPages = this.numPages + printed;
        System.out.println("You have printed " + printed + " pages");
    }



    public int getNumPages() {
        return numPages;
    }
}
