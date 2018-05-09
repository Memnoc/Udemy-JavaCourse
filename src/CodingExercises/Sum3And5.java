package CodingExercises;

public class Sum3And5 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
            for (int i = 1; i < 1000; i++) {
                sum = sum + i;
                count++;
                if (count == 5){
                    break;
                }
                System.out.println(sum);

            }

        }

    }



