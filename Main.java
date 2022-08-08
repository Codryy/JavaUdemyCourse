public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Romanian Bank");

        if(bank.addBranch("Raiffeisen")) {
            System.out.println("Raiffeisen branch created");
        }

        bank.addCustomer("Raiffeisen", "Adrian", 50);
        bank.addCustomer("Raiffeisen", "Mike", 175.34);
        bank.addCustomer("Raiffeisen", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Raiffeisen", "Adrian", 44.42);
        bank.addCustomerTransaction("Raiffeisen", "Adrian", 12.44);
        bank.addCustomerTransaction("Raiffeisen", "Mike", 1.42);

        bank.listCustomer("Raiffeisen", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Raiffeisen")) {
            System.out.println("Raiffeisen branch already exists");
        }

        if (!bank.addCustomerTransaction("Raiffeisen", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Raiffeisen", "Adrian", 12.21)) {
            System.out.println("Customer Adrian already exists");
        }

        
    }
}
