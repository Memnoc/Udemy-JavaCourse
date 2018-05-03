package CodingExercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
//        System.out.println(isLeapYear(- 1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(- 1, 2020));
        System.out.println(getDaysInMonth(1, - 2020));

    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return ((year % 4) == 0) && (year % 100) != 0 || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int m, int year) {
        int d;
        if ((m < 1) || (m > 12)) {
            return - 1;
        } else if ((year < 1) || (year > 9999)) {
            return - 1;
        } else if (m == 1 || m == 3 || m == 5 || m == 7 ||m == 8 || m == 10 || m == 12) {
                d = 31;
            } else if  (m == 4 || m == 6 || m == 9 || m == 11) {
                d = 30;
            } else if (isLeapYear(year) && m == 2) {
                d = 29;
            } else if (m == 2) {
                d = 28;
            } else {
                d = 0;
            }
            return d;
        }
    }
