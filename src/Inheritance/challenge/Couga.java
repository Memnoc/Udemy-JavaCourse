package Inheritance.challenge;

public class Couga extends Car {

    private int monthsOfInsurance;

    public Couga(int monthsOfInsurance) {
        super("SUV", 4, 6, true);
        this.monthsOfInsurance = monthsOfInsurance;
    }

    public void accelerateCar (int speed) {
        int currentSpeed  = getCurrentVelocity() + speed;

        if (currentSpeed == 0) {
            stop();
        } else if (currentSpeed > 0 && currentSpeed <= 10) {
            changeCurrentGear(1);
        } else if (currentSpeed > 0 && currentSpeed <= 20) {
            changeCurrentGear(2);
        } else if (currentSpeed > 0 && currentSpeed <= 30) {
            changeCurrentGear(3);
        } else if (currentSpeed > 0 && currentSpeed <= 40) {
            changeCurrentGear(4);
        } else if (currentSpeed > 0 && currentSpeed <= 50) {
            changeCurrentGear(5);
        } else {
            changeCurrentGear(6);
        }

        if (currentSpeed > 0) {
            changeCurrentVelocity(currentSpeed, getCurrentDirection());
        }
    }
}
