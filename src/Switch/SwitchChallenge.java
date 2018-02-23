package Switch;

// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class SwitchChallenge {

    public static void main(String[] args) {
        char value = 'Y';

        switch (value) {
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            case 'D':
                System.out.println("This is D");
                break;
            case 'E':
                System.out.println("This is E");
                default:
                    System.out.println("This was no letter!");
        }

        String month = "january";

        switch (month) {
            case "January":
                System.out.println("This is January");
                break;
            case "Feb":
                System.out.println("This is February");
                break;
            case "March":
                System.out.println("This is March");
                break;
            case "Apr":
                System.out.println("This is April");
                break;
            case "June":
                System.out.println("This is June");
            default:
                System.out.println("This was no month!");
        }
    }
}
