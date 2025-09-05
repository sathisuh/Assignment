package Vehicle;

class Audi extends Car {
    String modelType;

    public void display() {
        System.out.println("Audi - Model: " + modelType + ", Ownership Cost: " + ownershipCost + ", Warranty: " + warranty +
                " years, Seats: " + seatingCapacity + ", Fuel: " + fuelType + ", Mileage: " + mileage + ", Price: ₹" + price);
    }
}


