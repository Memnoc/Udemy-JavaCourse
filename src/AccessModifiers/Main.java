package AccessModifiers;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

         int answer = multiply(6);
        System.out.println("the answer is " + answer);
        System.out.println("Multiplier is " + multiplier);


        Account mattAccount = new Account("Matteo");
        mattAccount.deposit(1000);
        mattAccount.withdraw(500);
        mattAccount.withdraw(-200);
        mattAccount.deposit(-20);
        mattAccount.calculateBalance();

        // Flaw: because the access modifiers are all public, we are able to change the balance in the account as we please.
        mattAccount.balance = 5000;

        System.out.println("balance on account is " + mattAccount.getBalance());
        // Moreover, we can masquerade and make so the bank will not notice anything, for the very same reason: access modifiers are all public
        mattAccount.transactions.add(4500);
        mattAccount.calculateBalance();

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number" + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3nd instance");
        System.out.println(thirdInstance.getName() + " is instance number" + StaticTest.getNumInstances());

    }

    public static int multiply(int number){
        return number*multiplier;
    }
}
