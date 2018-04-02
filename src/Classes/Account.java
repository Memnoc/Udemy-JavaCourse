package Classes;

// Continuing the lesson on classes, we are now talking about constructors
// We'll copy over the info from the class used in the challengePreparation ClassPart1Challenge.java

public class Account {

    private int mAccountNumber;
    private int mBalance;
    private int mWithdraw;
    private int mPhoneNumber;
    private String mEmail;
    private String mCustomerName;

    // constructor default
    // You can overload constructor like you do with methods.
    // Hence, you can have multiple constructors in one class
    // as long as they take different parameters

    //You can also call a constructor within another constructor.
    // Which means that, if I am creating an object of this class and I am not
    // passing any parameters to it, I can then default the values in the empty constructor
    // by using the keyword this() + the parameters
    // It's optional and something you don't HAVE to do, but you may want to.
    // Essentially you make sure the class objects are created with all the necessary fields set up.
    // This way of calling the constructor must always be the very first line.

    public Account () {
        this(123, 200, 0, 567, "default@email", "Matt" );
        System.out.println("Empty constructor");
    }

    // Second constructor

    public Account(int AccountNumber, int Balance, int Withdraw, int PhoneNumber, String Email, String CustomerName) {
        this.mAccountNumber = AccountNumber;
        this.mBalance = Balance;
        this.mWithdraw = Withdraw;
        this.mPhoneNumber = PhoneNumber;
        this.mEmail = Email;
        this.mCustomerName = CustomerName;
        System.out.println("Account constructor with parameters called");
    }

    public int getmAccountNumber() {
        return mAccountNumber;
    }

    public int getmBalance() {
        return mBalance;
    }

    public int getmWithdraw() {
        return mWithdraw;
    }

    public int getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmCustomerName() {
        return mCustomerName;
    }

    public void setmAccountNumber(int AccountNumber) {
        this.mAccountNumber = AccountNumber;
    }

    public void setmBalance(int balance) {
        this.mBalance = balance;
    }

    public void setmPhoneNumber(int PhoneNumber) {
        this.mPhoneNumber = PhoneNumber;
    }

    public void setmEmail(String Email) {
        this.mEmail = Email;
    }

    public void setmCustomerName(String CustomerName) {
        this.mCustomerName = CustomerName;
    }

    public void depositFunds (int balance) {
        this.mBalance += balance;
        System.out.println("Deposit of " + balance + " made. New balance is " + this.mBalance);
    }

    public void withdrawFunds (int withdraw) {
        if (mBalance - withdraw < 0) {
            System.out.println("You have not sufficient funds. Only " + mBalance + " available. Withdrawal not processed");
        } else  {
            this.mBalance = mBalance -= withdraw;
            System.out.println("Withdrawal of  " + withdraw + " processed. Remaining balance = " + mBalance);
        }
    }


}
