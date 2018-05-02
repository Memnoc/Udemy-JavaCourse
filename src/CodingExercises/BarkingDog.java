package CodingExercises;

public class BarkingDog {
    private static int hoursOfDay;

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, - 1));
        System.out.println(bark(false, - 21));
        System.out.println(bark(false, 43));
        System.out.println(bark(true, 43));


    }

        public static boolean bark ( boolean barking, int hourOfDay){
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else return barking && hourOfDay < 8;
        }


//    SAME AS:

//    public static boolean bark(boolean barking, int hourOfDay) {
//
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        } else if ((barking && hourOfDay < 8) || (hourOfDay > 23)){
//            return true;
//        }
//        return false;
//    }
}



