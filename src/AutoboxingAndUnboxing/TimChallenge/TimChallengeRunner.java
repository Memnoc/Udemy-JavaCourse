package AutoboxingAndUnboxing.TimChallenge;

public class TimChallengeRunner {

    public static void main(String[] args) {


        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 1.65);

        bank.listCustomers("Adelaide", false);



    }
}
