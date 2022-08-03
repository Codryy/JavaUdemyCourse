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

public class VipCustomer {

    private String name;
    private String emailAdress;
    private double creditLimit;

    public VipCustomer() {
        this("Default", "default@gmail.com", 500.00);
        System.out.println("Calling constructor with no parameters");
    }

    public VipCustomer(String name, String emailAdress){
        this(name, emailAdress, 100);
        System.out.println("Calling constructor with two parameters");
    }

    public VipCustomer(String name, String emailAdress, double creditLimit){
        System.out.println("Calling constructors with three parameters");
        this.name = name;
        this.emailAdress = emailAdress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
