package BankAccount;

class SBI extends RBI {
    public SBI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 5.0; // SBI gives more than minimum
    }

    @Override
    public double getWithdrawalLimit() {
        return 60000;
    }
}



