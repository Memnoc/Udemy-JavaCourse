package CodingExercises;

public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(3,2,12));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0) {
            return false;
        }
        if(bigCount * 5 >= goal) {
           return smallCount >= goal %5;
        } else {
            return smallCount >= (goal - bigCount * 5);
        }

    }


}
