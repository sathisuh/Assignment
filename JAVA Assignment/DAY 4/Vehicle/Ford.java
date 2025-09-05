package Vehicle;

class Ford extends Car {
    String modelType;

    public void display() {
        System.out.println("Ford - Model: " + modelType + ", Ownership Cost: " + ownershipCost + ", Warranty: " + warranty +
                " years, Seats: " + seatingCapacity + ", Fuel: " + fuelType + ", Mileage: " + mileage + ", Price: ₹" + price);
    }
}
