
/* 1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline
(e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which
all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a
saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set
any rates above it.

Write a program to implement bank functionality in the above scenario.
Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes
 (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.

Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
        }
Class Account
{
// Account Detail ...
// Few functions ...
        }
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
}*/

package BankAccount;

public class BankMain {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Sathish", "C001");
        Account acc1 = new Account("A101", 100000);
        RBI sbi = new SBI(cust1, acc1);
        System.out.println("--- SBI ---");
        sbi.displayDetails();

        Customer cust2 = new Customer("Wayne", "C002");
        Account acc2 = new Account("A102", 50000);
        RBI icici = new ICICI(cust2, acc2);
        System.out.println("\n--- ICICI ---");
        icici.displayDetails();
    }
}
