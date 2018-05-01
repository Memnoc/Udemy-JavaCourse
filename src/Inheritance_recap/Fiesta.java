package Inheritance_recap;

public class Fiesta extends Car {
    private String brand;
    private String colour;
    private int year;
    private int doors;
    private boolean isManual;

    public Fiesta(String brand, String colour, int year, int doors, boolean isManual) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.doors = doors;
        this.isManual = isManual;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public void changeGears(int gears) {
        if (!isManual) {
            System.out.println("You have an automatic gear");
        } else {
            switch (gears) {
                case 1:
                    System.out.println("gear " + gears);
                    break;
                case 2:
                    System.out.println("gear " + gears);
                    break;
                case 3:
                    System.out.println("gear " + gears);
                    break;
                case 4:
                    System.out.println("gear " + gears);
                    break;
                case 5:
                    System.out.println("gear " + gears);
                    break;
                default:
                    System.out.println("clutch is disabled");
                    break;
            }
        }
    }
}
