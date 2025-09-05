import java.util.ArrayList;

class Account {
    private int accountNumber;
    private String holderName;
    private Double balance; // Autoboxing

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; // Autoboxing
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void applyInterest(Double interestRate) {
        // Unboxing both balance and interestRate
        double updatedBalance = balance + (balance * interestRate / 100);
        balance = updatedBalance; // Autoboxing again
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        // Create list to hold accounts
        ArrayList<Account> accounts = new ArrayList<>();

        // Add accounts (autoboxing balance)
        accounts.add(new Account(101, "Sathish", 5000.0));
        accounts.add(new Account(102, "Kumar", 7500.0));
        accounts.add(new Account(103, "Ravi", 10000.0));

        // Manual boxing for interest rate
        double interestRatePrimitive = 5.0;
        Double interestRate = Double.valueOf(interestRatePrimitive); // Manual boxing

        System.out.println("Bank Account Details with Interest Applied:\n");

        for (Account acc : accounts) {
            // Original values
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Original Balance: ₹" + acc.getBalance());

            // Apply interest
            acc.applyInterest(interestRate);

            // Show new balance (unboxing)
            double newBalance = acc.getBalance(); // Unboxing
            System.out.println("New Balance after 5% Interest: ₹" + newBalance);
            System.out.println("---------------------------------------------");
        }
    }
}