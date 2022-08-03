public class Main {

    public static void main(String[] args) {

        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Adrian","adrian@gmail.com");
        VipCustomer customer3 = new VipCustomer("Adrian","adrian@gmail.com", 200);

        System.out.println("Name for customer1: " + customer1.getName() + ", email: " + customer1.getEmailAdress() + " and credit limit: " + customer1.getCreditLimit());
        System.out.println("Name for customer1: " + customer2.getName() + ", email: " + customer2.getEmailAdress() + " and credit limit: " + customer2.getCreditLimit());
        System.out.println("Name for customer1: " + customer3.getName() + ", email: " + customer3.getEmailAdress() + " and credit limit: " + customer3.getCreditLimit());
    }
}
