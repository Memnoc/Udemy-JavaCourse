package Inheritance_recap;

public class Main {

    public static void main(String[] args) {

        //Car car = new Car("Common", 4, true, true);
        Fiesta fiesta = new Fiesta("Ford", "yellow",2016, 4, true);
        fiesta.changeGears(1);
        fiesta.changeGears(2);
        fiesta.changeGears(3);
        fiesta.accelerate(20);
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");
        System.out.println("the current car speed is " + fiesta.getSpeed() + " kmh per hour");
        fiesta.changeGears(2);
        fiesta.accelerate(20);
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");
        fiesta.changeGears(3);
        fiesta.accelerate(20);
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");
        fiesta.changeGears(4);
        fiesta.accelerate(20);
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");
        fiesta.changeGears(5);
        fiesta.accelerate(20);
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");

        System.out.println("the car is decelerating " + fiesta.decelerate(10) + "kmh per hour");
        System.out.println("the current car speed is " + fiesta.getSpeed() + "kmh per hour");





    }

}
