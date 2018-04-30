package Constructors_recap;

public class Bank {

    private int accountNumber;
    private double balance = 0.0;
    private String name;
    private int phone;
    private String email;

    public Bank(int accountNumber, double balance, String name, int phone, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double deposit(double balance) {
        if (balance > 0) {
            this.balance += balance;
            return balance;
        }
        return balance;
    }

    public double withdraw (double amount) {
        double funds = 0;
        if ((amount > 0) && (balance >= amount)) {
            funds = this.balance -= amount;
        } else if (amount > this.balance) {
            System.out.println("Not enough funds");
        }
        return funds;
    }
}
