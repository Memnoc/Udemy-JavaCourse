package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customer;
    private double amount;

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();


    }

    public void addNewCustomer(String customerName, double initialAmount) {
        this.amount = initialAmount;
        Customer newCustomer = new Customer(customerName, amount);
        this.customer.add(newCustomer);
        System.out.println("The customer name is " + customerName + " and the amount is " + amount);
    }

    private void addInitialTransaction(double initialAmount) {
        this.amount = initialAmount;
    }

    public void additionalTransaction(String customerName, double additionalAmount) {
        for (int i = 0; i <this.customer.size(); i++) {
            if (this.customer.get(i).getName() != null) {
                addInitialTransaction(this.amount += additionalAmount);
                System.out.println("The customer balance after addition is " + (this.amount + additionalAmount));
            }

        }

    }
}