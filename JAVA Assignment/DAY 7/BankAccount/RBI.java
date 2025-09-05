package BankAccount;

class RBI {
    Customer customer;
    Account account;

    public RBI(Customer customer, Account account) {
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 50000;
    }

    public void displayDetails() {
        customer.displayCustomer();
        account.displayAccount();
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Max Withdrawal: ₹" + getWithdrawalLimit());
    }
}
