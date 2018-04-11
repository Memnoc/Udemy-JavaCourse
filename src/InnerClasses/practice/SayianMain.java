package InnerClasses.practice;

public class SayianMain {

    public static void main(String[] args) {

//        The outer class access and declaration is standard
//        Sayian Earthlings = new Sayian("Earthlings", "base form");
//        What changes is the access to the inner class = OuterClass.InnerClass name = outerClassObjectName.new
//        Sayian.Transformation superSayan = Earthlings.new Transformation("Super Sayian",1);
//
//        System.out.println(Earthlings.getName() + " is transforming into " + superSayan.getTransformationName() + " " + superSayan.getTransformationPowerLevel());

        // This was for the Transformation class being public. I have then changed it to private and modified it a bit
        // to work. The reason why is better to do so is that I do not want to expose the Transformation class, makes no sense.
        // I want to use it, but via the Sayian class.
        // Let's test it:

        Sayian goku = new Sayian("Earthlings", "Base form", 100);
        goku.formType("Base Form", 1);
        System.out.println(goku.getName() + " is in " + goku.getCurrentStatus() + " and the current level is " + goku.getCurrentLevel());
        goku.powerUpLevel("Super Sayian", 1, 30000);
        System.out.println(goku.getName() + " is in " + goku.getCurrentStatus() + " " + goku.getCurrentLevel() + " form" + " and the current level is " + goku.getNewLevel());


        Sayian vegeta = new Sayian("Vegeta", "Base form", 100);
        vegeta.formType("Base Form", 1);
        System.out.println(vegeta.getName() + " is in " + vegeta.getCurrentStatus() + " and the current level is " + vegeta.getCurrentLevel());
        vegeta.powerUpLevel("Super Sayian", 2, 90000);
        System.out.println(vegeta.getName() + " is in " + vegeta.getCurrentStatus() + " " + vegeta.getCurrentLevel() + " form" + " and the current level is " + vegeta.getNewLevel());

    }
}
