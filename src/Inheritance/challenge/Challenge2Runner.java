package Inheritance.challenge;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For your specific type of vehicle you will want to add something specific for that type of car.

public class Challenge2Runner {

    public static void main(String[] args) {

        Couga couga = new Couga(24);
        couga.steer(10, "right");
        couga.accelerateCar(10);
        couga.accelerateCar(20);
        couga.accelerateCar(-10);


    }
}
