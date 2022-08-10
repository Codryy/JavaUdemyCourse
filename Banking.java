import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if ( findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if ( branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if ( branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if ( branch != null) {
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            System.out.println("Customer details for branch " + branch.getName());
            for ( int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer: " + branchCustomers.get(i).getName() + "[" + (i+1) +"]");
                if(printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for ( int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    private Branch findBranch(String branchName) {
        for ( int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(branchName)) {
                return this.branches.get(i);
            }
        }
        return null;
    }
}

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if ( findCustomer(customerName) == null ) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if ( existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for ( int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

}

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialTransaction) {
        this.name = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
