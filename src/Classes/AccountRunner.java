package Classes;

// We are gonna use the constructor here to exploit the ability of initialize
// the class object and manipulate at the beginning of the compilation
// Constructor is only called once

public class AccountRunner {

    public static void main(String[] args) {

        //Account constructor1 = new Account();

        // Constructor 2 is initialized here from the constructor in the Account.class
        // It's setting all these parameters that can be easily set in within the constructor
        Account constructor2 = new Account(); //12345, 1000, 500, 567, "myemail@matteo.com", "bob" );
        System.out.println(constructor2.getmCustomerName());
        System.out.println(constructor2.getmBalance());

//        account.depositFunds(100);
//        account.withdrawFunds(50);

        // We are gonna replace this value fetched ny the getter method by
        // initializing them into the constructor
//        account.setmCustomerName("Matteo");
//        account.setmEmail("mstara80@mail.com");
//        account.setmPhoneNumber(123456789);
    }
}
