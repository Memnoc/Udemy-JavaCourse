package Inheritance_recap;

public class Vehicle {
    private String type;
    private String terrain;


    public Vehicle(String type, String terrain) {
        this.type = type;
        this.terrain = terrain;

    }

    public Vehicle() {
    }

    public String getType() {
        return type;
    }

    public String getTerrain() {
        return terrain;
    }

    public void start(){
        System.out.println("The vehicle engine is starting");
    }

    public void turnOff() {
        System.out.println("The vehicle engine is turned off");
    }
}
