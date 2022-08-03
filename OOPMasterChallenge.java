public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Oregano", "Chicken");
        hamburger.getAddition();
        hamburger.price();
        hamburger.addAddition("Tomato");
        hamburger.price();
        hamburger.addAddition("Lettuce");
        hamburger.price();
        hamburger.subtractAddition("Lettuce");
        hamburger.price();

        HealthyBurger burger = new HealthyBurger("Chicken");
        burger.getAddition();
        System.out.println("******");
        burger.price();
        burger.addAddition("Jalapenos");
        burger.price();
        System.out.println("******");
        burger.addAddition("Bacon");
        burger.addAddition("Tomato");
        burger.addAddition("Lettuce");
        burger.price();
        System.out.println("******");
        burger.subtractAddition("Bacon");
        burger.price();
        System.out.println("******");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Cola");
        deluxeHamburger.price();
        System.out.println("******");
        deluxeHamburger.addAddition("Tomato");
        deluxeHamburger.price();
        System.out.println("******");
        deluxeHamburger.subtractAddition("Tomato");
        deluxeHamburger.price();
        System.out.println("******");
    }
}

public class Hamburger {

    private final String lettuce, tomato, carrot, cucumber;
    private String breadType, meat;
    private String name;
    protected double price;

    private int countLettuce, countTomato, countCarrot, countCucumber;
    protected int countAddition;

    public Hamburger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        if( (this.meat.equalsIgnoreCase("chicken")) ) {
            this.price = 5.99;
        } else this.price = 7.99;
        this.name = "Classic Hamburger";
        this.lettuce = "Lettuce";
        this.tomato = "Tomato";
        this.carrot = "Carrot";
        this.cucumber = "Cucumber";
        this.countAddition = 0;
    }

    public void getAddition() {
        System.out.println("Extras for base hamburger:");
        System.out.println(lettuce + " 1.00");
        System.out.println(tomato + " 1.25");
        System.out.println(carrot + " 1.50");
        System.out.println(cucumber + " 1.75");
    }

    public void addAddition(String addition) {
        if(countAddition <= 5){
            countAddition ++;
            switch (addition.toLowerCase()) {
                case "lettuce":
                    this.price += 1.00;
                    countLettuce += 1;
                    break;
                case "tomato":
                    this.price += 1.25;
                    countTomato += 1;
                    break;
                case "carrot":
                    this.price += 1.50;
                    countCarrot += 1;
                    break;
                case "cucumber":
                    this.price += 1.75;
                    countCucumber += 1;
                    break;
                default:
                    System.out.println("Extra chose by the customer not found!");
                    break;
            }
        } else System.out.println("Limit of extras reached!");
    }

    public void subtractAddition(String addition) {
        if(countAddition > 0) {
            countAddition--;
            switch (addition.toLowerCase()) {
                case "lettuce":
                    this.price -= 1.00;
                    countLettuce -= 1;
                    break;
                case "tomato":
                    this.price -= 1.25;
                    countTomato -= 1;
                    break;
                case "carrot":
                    this.price -= 1.50;
                    countCarrot -= 1;
                    break;
                case "cucumber":
                    this.price -= 1.75;
                    countCucumber = 1;
                    break;
                default:
                    System.out.println("Extra chose by the customer not found!");
                    break;
            }
        } else System.out.println("No extras present on the hamburger");
    }

    public void price() {

        if( this.meat.equalsIgnoreCase("chicken") ){
            System.out.println("Hamburger price is " + 5.99);
        } else {
            System.out.println("Hamburger price is " + 7.99);
        }

        if(countLettuce > 0) {
            System.out.println("Extra lettuce: " + countLettuce +", price: " + (countLettuce*1.00) );
        }
        if(countTomato > 0) {
            System.out.println("Extra tomato: " + countTomato +", price: " + (countTomato*1.25) );
        }
        if(countCarrot > 0) {
            System.out.println("Extra carrot: " + countCarrot +", price: " + (countCarrot*1.50) );
        }
        if(countCucumber > 0) {
            System.out.println("Extra cucumber: " + countCucumber +", price: " + (countCucumber*1.70) );
        }

        System.out.println("The total price is: " + this.price);
    }
}

public class HealthyBurger extends Hamburger{

    private String Jalapenos, bacon;
    private int countJalapenos, countBacon;
    public HealthyBurger(String meat) {
        super("Brown Rye Bread Roll", meat);
        this.Jalapenos = "Jalapenos";
        this.bacon = "bacon";
    }

    @Override
    public void getAddition() {
        super.getAddition();
        System.out.println("Extras for Healthy Hamburger: ");
        System.out.println(Jalapenos + " 2.00");
        System.out.println(bacon + " 3.00");
    }

    @Override
    public void addAddition(String addition) {
        if (super.countAddition <= 6) {
            super.countAddition++;
            switch (addition.toLowerCase()) {
                case "jalapenos":
                    super.price += 2.00;
                    countJalapenos += 1;
                    break;
                case "bacon":
                    super.price += 3.00;
                    countBacon += 1;
                    break;
                default:
                   super.addAddition(addition);
            }
        }
    }

    @Override
    public void subtractAddition(String addition) {
        if (countAddition > 0) {
            countAddition--;
            switch (addition.toLowerCase()) {
                case "jalapenos":
                    super.price -= 2.00;
                    this.countJalapenos -= 1;
                    break;
                case "bacon":
                    super.price -= 3.00;
                    this.countBacon -= 1;
                    break;
                default:
                    super.subtractAddition(addition);
            }
        }
    }
    @Override
    public void price() {
        if(countJalapenos > 0) {
            System.out.println("Extra Jalapenos: " + countJalapenos + ", price: " + (countJalapenos*2.00) );
        }
        if(countBacon > 0) {
            System.out.println("Extra bacon: " + countBacon + ", price: " + (countBacon*3.00) );
        }
        super.price();
    }
}

public class DeluxeHamburger extends Hamburger{

    private String Chips, Drink;

    public DeluxeHamburger(String drink) {
        super("Oregano", "Vita");
        this.Drink = drink;
        this.Chips = "chips";
        super.price += 6.00;
    }

    @Override
    public void getAddition() {
        System.out.println("Chips and Cola, Fanta, Sprite, Schweppes or Water");
    }

    @Override
    public void addAddition(String addition) {
        System.out.println("No more additions allowed");
    }

    @Override
    public void subtractAddition(String addition) {
        System.out.println("No additions present to subtract");
    }

    @Override
    public void price() {
        System.out.println("Extra Deluxe Addition: ");
        System.out.println("Chips and " + this.Drink + ", price: 6.00");
        super.price();
    }
}
