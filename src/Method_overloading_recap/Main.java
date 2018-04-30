package Method_overloading_recap;

// Overloading is the ability to use the same method multiple times changing its parameters
// It improves code readability and re-usability
// It is easier to remember one method name instead of remembering multiple names
// Achieves consistency in naming. ONe name for methods that are commonly used for example println.
// Overloaded methods give programmers the flexibility to call a similar method with different data types.

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum one called " + sum(1, 1));
        System.out.println("Sum two called " + sum(1,1,1));;
        System.out.println("Sum three called " + sum(1,1,1,1));
    }


    public static int sum (int one, int two) {
        return one + two;
    }

    public static int sum (int one, int two, int three) {
        return one + two + three;
    }

    public static int sum (int one, int two, int three, int four) {
        return one + two + three + four;
    }


}
