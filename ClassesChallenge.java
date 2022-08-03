public class Main {
    public static void main(String[] args) {
        Bank account = new Bank();
        account.setAccountNumber(1);
        System.out.println("Your account number is: " + account.getAccountNumber());
        account.setBalance(5000);
        System.out.println("Your balance is: " + account.getBalance());
        account.setCustomerName("Codrianu Adrian");
        System.out.println("Your name is: " + account.getCustomerName());
        account.setEmail("adicodrianu@gmail.com");
        System.out.println("Your email is: " + account.getEmail());
        account.setPhoneNumber("0735564737");
        System.out.println("Your phone number is: " + account.getPhoneNumber());
        account.Deposit(5000);
        account.Withdraw(11000);
        account.Withdraw(9000);
        account.Withdraw(1000);
    }
}

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void Deposit(int number){
        this.balance += number;
        System.out.println("You have deposited: " + number + " RON");
        System.out.println("Your total balance now is: " + balance + " RON");
    }

    public void Withdraw(int number){
        if( number > balance) {
            System.out.println("You do no have enough balance");
        } else {
            this.balance -= number;
            System.out.println("You have withdraw: " + number + " RON");
            System.out.println("Your total balance now is: " + balance + " RON");
        }
    }

}
