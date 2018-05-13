package PolymorphismRecap;

class Car {

    public boolean hasEngine;
    public int cylinders;
    public int wheels;
    public String name;

    public Car(int cylinders, String name) {
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return  "Started the engine started";
    }

    public String accelerate(){
        return "Accelerating";
    }

    public String stop(){
        return "Stopping";
    }
}

class Ford extends Car {
    public Ford() {
        super(4, "Fiesta Sport 16v");
    }

    @Override
    public String accelerate() {
        return "Fiesta is accelerating";
    }
}

class Volkswagen extends Car {
    @Override
    public String accelerate() {
        return "Tuareg is accelerating";
    }

    public Volkswagen() {
        super(8, "Tuareg");

    }

}

class Mitsubishi extends Car{
    public Mitsubishi() {
        super(12, "Evo IV");
    }

    @Override
    public String accelerate() {
        return "Lancer is accelerating";
    }
}



public class Main{
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            Car car = randomCar();
            System.out.println("Car#" + i +
                            " : " + car.getName() + "\n" +
                            "Start engine" + " : " + car.startEngine() + "\n" +
                            "Accelerate" + " : " + car.accelerate() + "\n" +
                            "Stop" + " : " + car.stop());
        }

    }



    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Ford();
            case 2:
                return new Volkswagen();
            case 3:
                return new Mitsubishi();
        }
        return null;
    }
}


