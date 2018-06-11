package CodingExercises;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {

       printYearsAndDays(525600);
       printYearsAndDays(1051200);
       printYearsAndDays(561600);

    }

    public static void printYearsAndDays (long minutes){
        long year = minutes / 525600;
        long days = (minutes % 525600) / 1440;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }

}
