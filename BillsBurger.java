public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

    }
}

public class Hamburger {

    private String name, meat, breadRollType;
    private double price;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double total = this.price;
        if(this.addition1Name != null) {
            total += this.addition1Price;
        }

        if(this.addition2Name != null) {
            total += this.addition2Price;
        }

        if(this.addition2Name != null) {
            total += this.addition3Price;
        }

        if(this.addition2Name != null) {
            total += this.addition4Price;
        }

        return total;
    }


}

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
    }

}

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double healthyPrice = super.itemizeHamburger();

        if( this.healthyExtra1Name != null) {
            healthyPrice += this.healthyExtra1Price;
        }

        if( this.healthyExtra2Name != null) {
            healthyPrice += this.healthyExtra2Price;
        }

        return healthyPrice;
    }
}
