package ReadingUserInput.challenge;

// Read ten number from the console entered by the user and print the sum of those numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers ");

        boolean hasNextInt = scanner.hasNextInt();
        int sum = scanner.nextInt();
        if (hasNextInt) {
            while (sum > 0) {
                System.out.println("Enter number #1: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #2: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #3: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #4: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #5: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #6: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #7: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #8: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #9: ");
                sum += scanner.nextInt();
                System.out.println("Enter number #10: ");
                sum += scanner.nextInt();
                System.out.println("the sum is " + sum);

            }
        } else {
            System.out.println("Invalid Number");
            scanner.nextInt();
        }


        scanner.close();

    }
}
