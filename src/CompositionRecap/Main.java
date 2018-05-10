package CompositionRecap;

public class Main {

    public static void main(String[] args) {

        Lamp lamp = new Lamp("Yellow", "Abajour");
        Desk desk = new Desk("Wood", "IKEA", lamp);
        Couch couch = new Couch("Black", "Chateauz D'aux", "Leather");

        Room room = new Room(couch, lamp, desk);
        room.sitAtCouch();
        room.sitAtDesk();
        room.turnLightOn();

    }
}
