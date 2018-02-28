package Classes.challengespart2;

public class Vehicle {

    private String typeName;

    private int currentVelocity;
    private String currentDirection;

    public Vehicle(String typeName) {
        this.typeName = typeName;
        this.currentVelocity = 0;
        this.currentDirection = "";
    }

    public String getTypeName() {
        return typeName;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void move(int velocity, String direction) {
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move() called - The car is moving at " + currentVelocity + " km per hour");
    }

    public void steer (int velocity, String direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called - The car is going to the " + currentDirection);
    }

    public void stop () {
        this.currentVelocity = 0;
    }
}
