package Encapsulation.EncapsulationChallenge;

public class PrinterRunner {

    public static void main(String[] args) {

        Printer printer = new Printer(0, true);
        System.out.println("Number of printed pages " + printer.getNumPages());
        printer.printPage(4);
        System.out.println("Number of printed pages " + printer.getNumPages());
        printer.printPage(4);
        System.out.println("Number of printed pages " + printer.getNumPages()); // technique 1

        printer.fillTonerUp(101); // technique 2





    }
}
