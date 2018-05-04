package CodingExercises;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(- 1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(112112));

    }

//    public static boolean isPalindrome(int number) {
//            String intStr = String.valueOf(number);
//            return intStr.equals(new StringBuilder(intStr).reverse().toString());
//    }


    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }
}
