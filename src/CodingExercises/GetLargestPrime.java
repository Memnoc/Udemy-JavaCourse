package CodingExercises;

public class GetLargestPrime {

    public static void main(String[] args) {

    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int nextNum = 2;
        while (number != 1) {
            while (number % nextNum == 0) {
                number /= nextNum;
            }
            nextNum++;
        }
        return nextNum-1;
    }
}
