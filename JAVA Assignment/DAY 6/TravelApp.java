
/*Design a travel booking system using two packages:
travel.booking – includes a class Ticket with ticket ID, destination, and fare.
travel.user – includes a class User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

import travel.booking.Ticket;
import travel.user.User;

public class TravelApp {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("m123", "Mumbai", 1200);
        User user = new User("S025", "Sathish Kumar");
        user.bookTicket(ticket);

    }
}