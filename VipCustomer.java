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
