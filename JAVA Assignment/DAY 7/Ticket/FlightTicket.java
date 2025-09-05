package Ticket;

class FlightTicket implements Ticket {
    private String airline, destination;

    public FlightTicket(String airline, String destination) {
        this.airline = airline;
        this.destination = destination;
    }

    @Override
    public void bookTicket() {
        System.out.println("Flight Ticket Booked via " + airline + " to " + destination);
    }
}
