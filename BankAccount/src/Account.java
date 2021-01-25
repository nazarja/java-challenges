public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(56789, 2.50, "default name", "default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(
            int accountNumber,
            double balance,
            String customerName,
            String email,
            String phoneNumber
    ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double number) {
        this.balance = number;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositFunds(double amount) {
        double balance = this.getBalance() + amount;
        this.setBalance(balance);
    }

    public void withdrawFunds(double amount) {
        double balance = this.getBalance();

        if (balance >= amount) {
            this.setBalance(balance - amount);
            System.out.println("Withdrawn " + amount);
        } else System.out.println("Not enough funds");
    }
}
