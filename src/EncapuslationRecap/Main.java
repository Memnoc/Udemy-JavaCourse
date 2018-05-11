package EncapuslationRecap;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(99, 0, true);

        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getNumberOfPages());


        printer.duplex = false; // demonstrating encapsulation fail

        printer.chargeToner(1);
        System.out.println(printer.getTonerLevel());

        printer.printing(2);
        System.out.println(printer.getNumberOfPages());




    }
}
