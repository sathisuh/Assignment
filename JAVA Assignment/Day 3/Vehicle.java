public class Vehicle {
    static int count = 0;
    int vehicleId;
    String brand;
    double price;

    Vehicle(int vehicleId, String brand, double price) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1, "Honda", 800000);
        Vehicle v2 = new Vehicle(2, "Hyundai", 900000);

        v1.display();
        v2.display();

        System.out.println("Total vehicles created: " + Vehicle.count);
    }
}