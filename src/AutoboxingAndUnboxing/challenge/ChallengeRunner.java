package AutoboxingAndUnboxing.challenge;

import ArrayList.TimChallenge.Contact;

import java.util.Scanner;

public class ChallengeRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static Branch branch = new Branch("Ulster1", "Tallaght", "UlsterBank");

    public static void main(String[] args) {
        addNewCustomer();
//        System.out.println("Customer balance is " + branch.getAccountBalance());
//        branch.deposit(150);
//        System.out.println("Customer balance is " + branch.getAccountBalance());
//        branch.withdraw(100);
//        System.out.println("Customer balance is " + branch.getAccountBalance());






    }

    private static void addNewCustomer() {
        System.out.println("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Customer newCustomer = Customer.createCustomer("Jim", false);
        if(branch.addBranchCustomer(newCustomer)) {
            System.out.println("New customer added: name = " +
                    name + "\nbranch = " +
                    branchName +
                    "\nInitial deposit: " + branch.getAccountBalance());
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

}
