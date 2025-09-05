package Ticket;

class BusTicket implements Ticket {
    private String from, to;

    public BusTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void bookTicket() {
        System.out.println("Bus Ticket Booked from " + from + " to " + to);
    }
}
