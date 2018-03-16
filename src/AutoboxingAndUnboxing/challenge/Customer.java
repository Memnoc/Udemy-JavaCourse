package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double amount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

}