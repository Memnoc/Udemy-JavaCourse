package Composition.CompositionChallenge;

public class Room {

    private Walls theWalls;
    private Couch theCouch;
    private TV theTV;

    public Room(Walls theWalls, Couch theCouch, TV theTV) {
        this.theWalls = theWalls;
        this.theCouch = theCouch;
        this.theTV = theTV;
    }

    public void RoomStyle () {
        System.out.println("The room style is Victorian");
    }

    public Walls getTheWalls() {
        return theWalls;
    }

    private void couchDelivery () {
        getTheCouch().couchBrand(); // accessing from getter
        delivery();
    }

    public void delivery(){
        theCouch.getCouchColor(); // accessing from variable
        System.out.println("Deliver the couch at my address");
    }

    private Couch getTheCouch() {
        return theCouch;
    }

    public TV getTheTV() {
        return theTV;
    }
}
