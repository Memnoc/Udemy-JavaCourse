package CompositionRecap;

public class Room {

    private Couch couch;
    private Lamp lamp;
    private Desk desk;

    public Room(Couch couch, Lamp lamp, Desk desk) {
        this.couch = couch;
        this.lamp = lamp;
        this.desk = desk;
    }

    public void turnLightOn(){
        getLamp().turnOnTheLamp();
    }

    public void sitAtDesk(){
        desk.sitAtDesk();
    }

    public void sitAtCouch(){
        couch.sitOnTheCouch();
    }

    private Couch getCouch() {
        return couch;
    }

    private Lamp getLamp() {
        return lamp;
    }

    private Desk getDesk() {
        return desk;
    }
}
