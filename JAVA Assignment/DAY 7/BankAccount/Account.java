package BankAccount;
class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
