package AutoboxingAndUnboxing.challenge;

public class ChallengeRunner {



    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        Branch branch  =new Branch("Adelaide");

//        branch.addNewCustomer("Tim",  50.05);
        bank.addNewBranch("Ulster");
//        bank.addCustomerToBranch("Tim", "Ulster", 5.00);
        branch.printBranchesList();









    }
}
