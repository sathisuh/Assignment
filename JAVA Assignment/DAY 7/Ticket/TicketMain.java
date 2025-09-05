/*Develop a Java application for a Ticket Booking System that allows users to book tickets for
different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class Ticket with a method bookTicket() that each
transportation mode must implement differently.
Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or
implement the interface.
Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the
base class/interface.*/

package Ticket;
public class TicketMain {
    public static void main(String[] args) {

        Ticket t1 = new BusTicket("Chennai", "Tenkasi");
        Ticket t2 = new TrainTicket("Zoho Express", "Sleeper");
        Ticket t3 = new FlightTicket("Amigo", "Delhi");


        t1.bookTicket();
        t2.bookTicket();
        t3.bookTicket();
   }
}
