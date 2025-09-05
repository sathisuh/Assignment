/*Illustrate the concept-Encapsulation with the Payment Gateway System.
[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount,
payment method, and transaction status.Provide appropriate public getter and setter methods to
and access modify these details securely. Also include a method to display the transaction summary.]*/

public class Payment {
    private String transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    // Getters and Setters
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getPayerName() { return payerName; }
    public void setPayerName(String payerName) { this.payerName = payerName; }

    public String getPayeeName() { return payeeName; }
    public void setPayeeName(String payeeName) { this.payeeName = payeeName; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getTransactionStatus() { return transactionStatus; }
    public void setTransactionStatus(String transactionStatus) { this.transactionStatus = transactionStatus; }

    public void displaySummary() {
        System.out.println("Transaction Summary:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payer: " + payerName + ", Payee: " + payeeName);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: " + transactionStatus);
    }


    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.setTransactionId("TXN123456");
        payment.setPayerName("Sathish");
        payment.setPayeeName("Amazon");
        payment.setAmount(1999.99);
        payment.setPaymentMethod("UPI");
        payment.setTransactionStatus("Success");

        payment.displaySummary();
    }
}