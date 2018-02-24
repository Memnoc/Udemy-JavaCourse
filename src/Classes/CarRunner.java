package Classes;

public class CarRunner {

    public static void main(String[] args) {

        // Notice how the class name Car here becomes the data typ of the variable
        // You can create multiple objects, no problems
        // We cannot access the member variables in Class.java as long as they are private
        // mModel field (or member variable) is public now and so accessible
        // This is bad practice as it defies encapsulation

        // A better practice is to set the field with a Setter
        // The get the field you set with a Getter
        // In this case, we are setting the mode first, then getting it and printing it out at the same time.

        Car porsche = new Car();
        //porsche.mModel = "Cougar";
        Car ford = new Car();
        porsche.setCar("porsche");
        System.out.println("The model is " + porsche.getModel());

    }
}
