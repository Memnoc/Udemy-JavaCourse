package Encapsulation.EncapsulationChallenge2;

// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.


public class Printer2 {

    private int toner;
    private boolean isDuplex;
    private int pages;

    public Printer2(int toner, boolean duplex) {
        this.toner = toner;
        this.isDuplex = duplex;
        this.pages = 0;

    }

    public int fillToner(int level) {
        if (level > 0 && level <= 100) {
            if (this.toner + level > 100) {
                return -1;
            }
            this.toner += level;
            return this.toner;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pages += pagesToPrint;
        return pagesToPrint;
    }

    public int getToner() {
        return toner;
    }


    public int getPages() {
        return pages;
    }
}
