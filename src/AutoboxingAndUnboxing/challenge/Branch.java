package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            return false;
        }
        this.customer.add(new Customer(customerName, initialAmount));
        System.out.println("new customer added " + customerName + " and amount is " + initialAmount);
        return true;
    }


    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customer.size(); i++) {
            Customer checkedCustomer = this.customer.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }


    public boolean additionalTransaction(String branchName, String customerName, double additionalAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            return false;
        }
        existingCustomer.addTransaction(additionalAmount);
            return true;
    }

    public void printBranchesList(){
        ArrayList<Branch> listBranches = new ArrayList<>();
        for (int i = 0; i <listBranches.size() ; i++) {
            System.out.println("You have " + listBranches);

        }
    }

}
