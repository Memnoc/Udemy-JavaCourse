package Classes;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class ClassPart1Challenge {

    private int mAccountNumber;
    private int mBalance;
    private int mWithdraw;
    private int mPhoneNumber;
    private String mEmail;
    private String mCustomerName;

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
