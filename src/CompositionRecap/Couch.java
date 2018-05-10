package CompositionRecap;

public class Couch {

    private String color;
    private String brand;
    private String textile;

    public Couch(String color, String brand, String textile) {
        this.color = color;
        this.brand = brand;
        this.textile = textile;
    }

    public void sitOnTheCouch(){
        System.out.println("Sit on the couch");

    }


    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getTextile() {
        return textile;
    }
}
