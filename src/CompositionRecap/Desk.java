package CompositionRecap;

public class Desk {

    private String material;
    private String manufacturer;
    private Lamp lamp;

    public Desk(String material, String manufacturer, Lamp lamp) {
        this.material = material;
        this.manufacturer = manufacturer;
        this.lamp = lamp;
    }

    public void sitAtDesk(){
        System.out.println("You sit at the desk");
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
