package Ticket;

class TrainTicket implements Ticket {
    private String trainName, seatClass;

    public TrainTicket(String trainName, String seatClass) {
        this.trainName = trainName;
        this.seatClass = seatClass;
    }

    @Override
    public void bookTicket() {
        System.out.println("Train Ticket Booked in " + trainName + " - Class: " + seatClass);
    }
}
