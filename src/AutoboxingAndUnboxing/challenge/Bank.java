package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;
    private ArrayList<Customer> customer;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
        this.customer = new ArrayList<Customer>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }
        Branch newBranch = new Branch(branchName);
        this.branches.add(newBranch);
        System.out.println("new branch addded: " + branchName);
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomerToBranch(String customerName, String branchName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }


    public boolean additionalTransaction(String branchName, String customerName, double additionalAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            return false;
        }
        return existingBranch.additionalTransaction(branchName,customerName,additionalAmount);
    }

}