package travel.user;

import travel.booking.Ticket;

public class User {
    private String userId;
    private String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void bookTicket(Ticket ticket) {
        System.out.println(userName +" "+ "UserId:"+ userId  + " booked a ticket");
        ticket.displayTicket();
    }
}
