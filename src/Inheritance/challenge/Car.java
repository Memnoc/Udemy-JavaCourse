package Inheritance.challenge;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String typeName,int doors, int gears, boolean isManual) {
            super(typeName);
        this.wheels = 4;
        this.doors = doors;
        this.gears = 0;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeCurrentGear (int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear() called - The gear is " + this.currentGear);
    }

    public void changeCurrentVelocity (int speed, String direction) {
        System.out.println("Car.changeCurrentVelocity called - Velocity :" + speed + " Direction: " + getCurrentDirection());
        move(speed, direction);
    }

}
