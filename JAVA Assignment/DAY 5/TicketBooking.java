// Base class
    class Ticket {
        public void bookTicket() {
            System.out.println("Booking ticket...");
        }
    }

    // Bus class
    class Bus extends Ticket {
        @Override
        public void bookTicket() {
            System.out.println("Bus ticket booked: Seat allocated with sleeper options.");
        }
    }

    // Train class
    class Train extends Ticket {
        @Override
        public void bookTicket() {
            System.out.println("Train ticket booked: Berth confirmed with PNR.");
        }
    }

    // Flight class
    class Flight extends Ticket {
        @Override
        public void bookTicket() {
            System.out.println("Flight ticket booked: E-ticket with boarding pass issued.");
        }
    }

