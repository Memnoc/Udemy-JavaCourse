package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Branch {


    private double accountBalance = 0.0;

    private String branchName;
    private String branchLocation;
    private String branchMasterBank;

    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName, String branchLocation, String branchMasterBank) {
        this.branchName = branchName;
        this.branchLocation = branchLocation;
        this.branchMasterBank = branchMasterBank;
        this.branchCustomers = new ArrayList<Customer>();

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public String getBranchMasterBank() {
        return branchMasterBank;
    }

    private static Branch createBranch(String name, String location, String master) {
        return new Branch(name, location, master);
    }

    private double withdraw(double sum) {
        return this.accountBalance += sum;
    }

    private double deposit(double sum) {
        return this.accountBalance -= sum;
    }

    public boolean addBranchCustomer (Customer customer) {
        if (findCustomer(customer.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        this.branchCustomers.add(customer);
        return true;
    }

    private int findCustomer(String contactName) {
        for(int i=0; i<this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);
            if(customer.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

}
