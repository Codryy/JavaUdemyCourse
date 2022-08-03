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
