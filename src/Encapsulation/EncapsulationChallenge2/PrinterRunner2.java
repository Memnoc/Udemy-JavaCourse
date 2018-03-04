package Encapsulation.EncapsulationChallenge2;

public class PrinterRunner2 {

    public static void main(String[] args) {

        Printer2 printer2 = new Printer2(50, false);
        System.out.println("initial page count = " + printer2.getPages());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("printed pages was = " + pagesPrinted + " new total count for printer is = " + printer2.getPages());
        pagesPrinted = printer2.printPages(2);
        System.out.println("printed pages was = " + pagesPrinted + " new total count for printer is = " + printer2.getPages());

        System.out.println("Initial toner level " + printer2.getToner());
        int tonerFilled = printer2.fillToner(10);
        System.out.println("toner level eas filled = " + tonerFilled + " new toner level is = " + printer2.getToner());


    }
}
