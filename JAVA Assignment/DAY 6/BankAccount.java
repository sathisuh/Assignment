/*Design a class named BankAccount that uses the concept of encapsulation. The class should have the following
private data members: account number, account holder name, and balance. Provide public getter and
setter methods to access and modify these fields. Also, include a method to deposit and withdraw
amount ensuring that the balance cannot go negative.*/

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setHolderName("Sathish Kumar");

        account.deposit(1000);
        account.withdraw(500);
        account.deposit(-100);
        account.withdraw(600);

        account.displayAccount();
    }
}