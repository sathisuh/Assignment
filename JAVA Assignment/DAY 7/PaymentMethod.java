/*Design a Payment Gateway System using an interface named PaymentMethod with a method
 pay(double amount). Implement this interface in different classes like CreditCardPayment,
DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using
different methods.*/


interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}

class DebitCardPayment implements Payment {
    private String cardNumber;

    public DebitCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card: " + cardNumber);
    }
}

class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}


public class PaymentMethod {
    public static void main(String[] args) {
        // Credit card payment
        Payment credit = new CreditCardPayment("1234-5678-9876-5432");
        credit.pay(1500.0);

        // Debit card payment
        Payment debit = new DebitCardPayment("4321-8765-6789-1234");
        debit.pay(2000.0);

        // UPI payment
        Payment upi = new UPIPayment("sathish@upi");
        upi.pay(500.0);
    }
}