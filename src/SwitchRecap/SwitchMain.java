package SwitchRecap;


/*
Create a new switch statement using char instead of int
create a new char variable
create a switch statement testing for A,B,C,D or E
display a message if any of this are found and then brake
Add a default which displays a message not found
 */

public class SwitchMain {

    public static void main(String[] args) {

        switchFun('A');
        switchFun('B');
        switchFun('C');
        switchFun('D');
        switchFun('E');


    }

    public static void switchFun(char test) {
        switch (test) {
            case 'A': case 'B': case 'C': case 'D':
                System.out.println("Value was " + test);
                break;
            default:
                System.out.println(test + " was not found");
                break;
        }
    }
}
