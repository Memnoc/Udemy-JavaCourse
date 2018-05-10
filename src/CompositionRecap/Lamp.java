package CompositionRecap;

public class Lamp {

    private String lampColour;
    private String model;

    public Lamp(String lampColour, String model) {
        this.lampColour = lampColour;
        this.model = model;
    }

    public void turnOnTheLamp(){
        System.out.println("Turned on the lamp");
    }

    public String getLampColour() {
        return lampColour;
    }

    public String getModel() {
        return model;
    }
}
