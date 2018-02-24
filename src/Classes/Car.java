package Classes;

// Class example ** This class is ran by CarRunner.java
//
// Member variable:
// Also called fields, are variables that can be seen at are accessible from anywhere in the class.
// When you declare these variables, you need to specify the access modifier, like for methods.
// General rule: defining field in Java for a class always takes the access modifier "private".
// This is generally known as "encapsulation" which makes the fields invisible nad inaccessible to other classes.
// The member variables generally are declared to define the characteristic of the class.
// Making member variables accessible from outside the class they live in can be done in different ways:
// one way is with Getters and Setters. These are method that respectively set and get the values of those variables.

// Having method and defining behaviour in a class gives you control over actions and decision-making process
// that you'd normally don't have.
// This is going to be set up once, then inherited each time you instantiate an object of that class.

// This is the true nature of encapsulation: by not allowing people to access your data directly and forcing the to
// go through methods and rules defined by you, you are in complete control of what can be done with your data
// and other developers will have to obey to what you have decided.

public class Car {

    private int mDoors;
    private int mWheels;
    private String mModel;
    private String mEngine;
    private String mColour;


    public void setCar(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("ford")) {
        this.mModel = model;
    } else {
            this.mModel = "Unknown";
        }

    }

    public String getModel() {
        return this.mModel;
    }
}