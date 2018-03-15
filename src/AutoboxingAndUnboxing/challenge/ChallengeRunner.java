package AutoboxingAndUnboxing.challenge;

import java.util.Scanner;

public class ChallengeRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static Branch branch = new Branch("Ulster1", "Tallaght", "UlsterBank");
    private static Bank bank = new Bank("UlsterBank");
    private static Customer customer = new Customer("UlsterBank", false);

    public static void main(String[] args) {
//        addNewCustomer();
//        System.out.println("Customer balance is " + branch.getAccountBalance());
//        branch.deposit(150);
//        System.out.println("Customer balance is " + branch.getAccountBalance());
//        branch.withdraw(100);
//        System.out.println("Customer balance is " + branch.getAccountBalance());
//        addNewBranch();
//        System.out.println("new branch name is " + branch.getBranchName());

//        addNewCustomer();
//        addNewCustomer();
//        branch.printListOfCustomers();
//        addNewBranch();
//        addNewBranch();
//        bank.printListOfBranch();







    }

    private static void addNewCustomer() {
        System.out.println("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Customer newCustomer = Customer.createCustomer(name, true);
        if(branch.addCustomer(newCustomer)) {
            System.out.println("New customer added: name = " +
                    name + "\nbranch = " +
                    branchName +
                    "\nInitial deposit: " + branch.getAccountBalance());
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void addNewBranch() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter branch location: ");
        String branchLocation = scanner.nextLine();
        System.out.println("Enter branch master: ");
        String branchMaster = scanner.nextLine();
        Branch newBranch = new Branch(branchName, branchLocation, branchMaster);
        if(bank.addBranch(newBranch)) {
            System.out.println("New branch added: " + branchName + branchLocation + branchMaster);
        } else {
            System.out.println("Cannot add, " + branchName + " already on file");
        }
    }



}
