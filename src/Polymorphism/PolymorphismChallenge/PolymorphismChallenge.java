package Polymorphism.PolymorphismChallenge;

class Car {
    private String mName;
    private boolean mIsDiesel;
    private int mCylinders;
    private int mWheels;

    public Car(String name, boolean isDiesel, int cylinders, int wheels) {
        mName = name;
        mIsDiesel = true;
        mCylinders = cylinders;
        mWheels = 4;
    }

    public Car(String carName) {
        this.mName = carName;
    }

    public String startEngine() {
        return " Car -> engine started";
    }

    public String accelerate() {
        return " Car -> is accelerating";
    }

    public String hitBrakes() {
        return " Car -> hit the brakes";
    }

    public String getName() {
        return mName;
    }

    public boolean isDiesel() {
        return mIsDiesel;
    }

    public int getCylinders() {
        return mCylinders;
    }

    public int getWheels() {
        return mWheels;
    }
}

class Fiesta extends Car {
    public Fiesta() {
        super("Fiesta", true, 12, 4);
    }

    @Override
    public String startEngine() {
        return " started the engine";
    }

    @Override
    public String hitBrakes() {
        return " hit the brakes";
    }

    @Override
    public String accelerate() {
        return " accelerating";
    }
}

class Micra extends Car {
    public Micra() {
        super("Micra", true, 12, 4);
    }

    @Override
    public String startEngine() {
        return " has started the engine";
    }

    @Override
    public String hitBrakes() {
        return " hit the brakes";
    }

    @Override
    public String accelerate() {
        return " accelerating";
    }

}


class Porche extends Car {
    public Porche() {
        super("Porche", false, 12, 4);
    }

    @Override
    public String startEngine() {
        return " started the engine";
    }

    @Override
    public String hitBrakes() {
        return " hit the brakes";
    }

    @Override
    public String accelerate() {
        return " accelerating";
    }
}


public class PolymorphismChallenge {

    public static void main(String[] args) {

        Car car = new Car("Car", true, 6, 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.hitBrakes());
        Fiesta fiesta = new Fiesta();
        System.out.println(fiesta.getName() + fiesta.startEngine());
        System.out.println(fiesta.getName() + fiesta.accelerate());
        System.out.println(fiesta.getName() + fiesta.hitBrakes());
        Micra micra = new Micra();
        System.out.println(micra.getName() + micra.startEngine());
        System.out.println(micra.getName() + micra.accelerate());
        System.out.println(micra.getName() + micra.hitBrakes());
        Porche porche = new Porche();
        System.out.println(porche.getName() + porche.startEngine());
        System.out.println(porche.getName() + porche.accelerate());
        System.out.println(porche.getName() + porche.hitBrakes());


    }
}
