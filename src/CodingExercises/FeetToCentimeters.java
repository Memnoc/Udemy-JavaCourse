package CodingExercises;

public class FeetToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double feetToCm = feet * 30.48;
            double inchesToCm = inches * 2.54;
            double cm = feetToCm + inchesToCm;
            System.out.println("Feet " + feet + " in Inches " + inches + " = " + cm + " cm");
        } else {
            System.out.println("Invalid parameters");
        }
        return - 1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double foot = (int) inches / 12;
            double difference = (int)inches % 12;
            double tot = calcFeetAndInchesToCentimeters(foot, difference);
            //System.out.println(inches + " feet in " + foot + " inches " + " = " + difference);
        }
        return - 1;

    }

}
