package BankAccount;
class ICICI extends RBI {
    public ICICI(Customer c, Account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 40000;
    }
}
