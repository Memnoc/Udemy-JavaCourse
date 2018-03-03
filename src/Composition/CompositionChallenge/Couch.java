package Composition.CompositionChallenge;

public class Couch {

    private String fabric;
    private String couchColor;

    public Couch(String fabric, String couchColor) {
        this.fabric = fabric;
        this.couchColor = couchColor;
    }

    public String getFabric() {
        return fabric;
    }

    public String getCouchColor() {
        System.out.println("getCouchColor called");
        return couchColor;
    }

    public void couchBrand () {
        System.out.println("This is an IKEA couch");

    }

}
