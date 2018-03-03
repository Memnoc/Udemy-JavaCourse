package Composition.CompositionChallenge2;

public class Challemge2Runner {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Matteo's", wall1, wall2, wall3, wall4, ceiling, bed, lamp );
        bedroom.getLamp().turnOn();
        bedroom.makeBed();


    }
}
