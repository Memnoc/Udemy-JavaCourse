package Classes.challenges;

public class VipCustomersRunner {

    public static void main(String[] args) {


        VipCustomers vipCustomers1 = new VipCustomers();
        System.out.println(vipCustomers1.getmName());

        VipCustomers vipCustomers2 = new VipCustomers("Matteo", "matt@mail.com");
        System.out.println(vipCustomers2.getmName());

        VipCustomers vipCustomers3 = new VipCustomers("Tim", 140.00, "tim@mail.com");
        System.out.println(vipCustomers3.getmName());
        System.out.println(vipCustomers3.getmCreditLimit());
        System.out.println(vipCustomers3.getmEmailAddress());
    }

}
