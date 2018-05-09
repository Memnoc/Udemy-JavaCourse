package CodingExercises;

public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(61, 00));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(long minutes, long seconds){
        if ((minutes >=0) && (seconds>=0) && (seconds <=59)){
            long hours = minutes / 60;
            long min = minutes % 60;
            long sec = seconds % 60;

            String hoursString = hours + "h";
            if (hours <10){
                hoursString = "0" + hoursString;
            }
            String minuteString = min + "m";
            if (min <10){
                minuteString = "0" + minuteString;
            }
            String secondsString = sec + "s";
            if (sec <10){
                secondsString = "0" + secondsString;
            }
            return hoursString + minuteString + secondsString;
        }
        return "Invalid value";
    }

    public static String getDurationString(long seconds){
        if (seconds >=0) {
            long totMin = seconds / 60;
            long restSec = seconds % 60;
            return getDurationString(totMin, restSec);
        }
        return "Invalid value";
    }
}
