package Classes.challenges;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VipCustomers {

    private String mName;
    private double mCreditLimit;
    private String mEmailAddress;

    public VipCustomers() {
        this("Default name", 120.0, "Default email");

    }

    public VipCustomers(String name, String email) {
        this(name, 0, email);
    }

    public VipCustomers(String mName, double mCreditLimit, String mEmailAddress) {
        this.mName = mName;
        this.mCreditLimit = mCreditLimit;
        this.mEmailAddress = mEmailAddress;
    }

    public String getmName() {
        return mName;
    }

    public double getmCreditLimit() {
        return mCreditLimit;
    }

    public String getmEmailAddress() {
        return mEmailAddress;
    }
}
