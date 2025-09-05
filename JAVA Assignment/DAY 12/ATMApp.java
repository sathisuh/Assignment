/*Use Threads to implement the ATM machine, where create thread to check the PIN number, another thread
to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/

class ATM {
    public synchronized void checkPin() {
        System.out.println("Checking PIN...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("PIN Verified!");
    }

    public synchronized void withdrawCash() {
        System.out.println("Withdrawing Cash...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("Cash Withdrawn!");
    }

    public synchronized void checkBalance() {
        System.out.println("Checking Balance...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("Balance: Rs. 10,000");
    }

    public synchronized void printReceipt() {
        System.out.println("Printing Receipt...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("Transaction Complete!");
    }
}

public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Thread t1 = new Thread(() -> atm.checkPin());
        Thread t2 = new Thread(() -> atm.withdrawCash());
        Thread t3 = new Thread(() -> atm.checkBalance());
        Thread t4 = new Thread(() -> atm.printReceipt());

        t1.start();
        try { t1.join(); } catch (InterruptedException e) {}

        t2.start();
        try { t2.join(); } catch (InterruptedException e) {}

        t3.start();
        try { t3.join(); } catch (InterruptedException e) {}

        t4.start();
    }
}