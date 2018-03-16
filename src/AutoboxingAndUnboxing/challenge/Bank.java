package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branch;

    public Bank(String bankName) {
        this.name = bankName;
        this.branch = new ArrayList<Branch>();
    }

    public void addNewBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        this.branch.add(newBranch);
        System.out.println("The branch name is " + branchName);
    }
}