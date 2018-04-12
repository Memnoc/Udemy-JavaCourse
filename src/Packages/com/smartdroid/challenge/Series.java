package Packages.com.smartdroid.challenge;

public class Series {

    public static void nSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void factorial2(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(fact);
        }
    }


    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;



        for (int i = 0; i < n; i++) {
            int temp = (a + b);
            b = a;
            a = temp;
            System.out.println(temp);


        }
    }




}
