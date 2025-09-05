/*Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets
share a common method but implement booking differently.*/
public class TicketMain {
    public static void main(String[] args) {
        Ticket t;

        t = new Bus();       // Upcasting
        t.bookTicket();      // Bus version will run

        t = new Train();
        t.bookTicket();      // Train version will run

        t = new Flight();
        t.bookTicket();      // Flight version will run
    }
}