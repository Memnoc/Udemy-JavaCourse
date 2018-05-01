package Inheritance_recap;

public class Car extends Vehicle {
    private int wheelNumber;
    private boolean hasWheels;
    private boolean isManual;
    private int speed;


    public Car(String type, int wheelNumber, boolean hasWheels, boolean isManual) {
        this.wheelNumber = 4;
        this.hasWheels = true;
        this.isManual = isManual;
        this.speed = 0;
    }

    public Car() {
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSpeed() {
        return speed;
    }



    public int steering(int steer) {
        if (steer == 0) {
            System.out.println("Going straight");
        } else if (steer == 1) {
            System.out.println("Going right");
        } else {
            System.out.println("Going left");
        }
        return steer;
    }



    public int accelerate(int velocity){
        this.speed += velocity;
        return velocity;
    }

    public int decelerate(int deceleration) {
        this.speed -= deceleration;
        return deceleration;
    }

}
