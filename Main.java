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
