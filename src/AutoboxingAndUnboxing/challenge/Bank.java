package AutoboxingAndUnboxing.challenge;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branch;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch branch) {
        if (findBranch(branch.getBranchName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        this.branch.add(branch);
        return true;
    }

    public int findBranch(String contactName) {
        for(int i=0; i<this.branch.size(); i++) {
            Branch branch = this.branch.get(i);
            if(branch.getBranchName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printListOfBranch() {
        System.out.println("You have " + branch.size() + " branches in your list");
        for (int i = 0; i < branch.size(); i++) {
            System.out.println((i+1) + ". " + branch.get(i).getBranchName());
        }
    }





}
