package Constructors_recap;

public class Main {



    public static void main(String[] args) {

        Bank customer1 = new Bank(111, 10.00, "Matteo", 2223344, "email@customer1.com");
        System.out.println("Customer balance is " + customer1.getBalance());
        System.out.println("Customer is withdrawing " + customer1.withdraw(5.00));
        System.out.println("Customer balance after withdraw is " + customer1.getBalance());
        System.out.println("Customer is depositing " + customer1.deposit(10.00));
        System.out.println("Customer balance after deposit is " + customer1.getBalance());
        customer1.withdraw(14.00);
        System.out.println("Customer balance is " + customer1.getBalance());

    }

}
