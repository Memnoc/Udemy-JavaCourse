package ArrayList.challenge;
import java.util.Scanner;

public class Contacts {

    private String mName;
    private int mPhoneNumber;

    private static Scanner scanner =  new Scanner( System.in );
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {



    }

    public static void addItem() {
        System.out.println("Enter the contact");
        mobilePhone.addContacts(scanner.nextLine());
    }


}
