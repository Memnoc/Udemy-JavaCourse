package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Customer {

    private boolean hasBranch = false;
    private String mName;
    private ArrayList<Double> transactions;

    public Customer(String name, boolean hasBranch) {
        this.mName = name;
        this.hasBranch = false;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return mName;
    }

    public boolean isHasBranch() {
        return hasBranch;
    }

    public static Customer createCustomer(String name, boolean hasBranch) {
        return new Customer(name, hasBranch);
    }
}
