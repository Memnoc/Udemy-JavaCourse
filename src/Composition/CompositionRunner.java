package Composition;

public class CompositionRunner {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        // This "new Resolution()" is a neat way to create a class on the go. Handy if you don't need to pass the class into a variable
        // but just need to pass it to a method
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("83-200", "Asus", 4, 6, "v2.44");

        // and this is how you assemble it together
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // This is how you call methods from other classes
        // Basically, you access the getter that returns the class in for of an object
        // This is essentially allowing you to access all the methods for the class

        // Having deleted those methods in PC class, we don't need them anymore now

//        thePC.getTheCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getMonitors().drawPixelAt(1500, 1200, "red");

    }
}
