package Vehicle;

class TVS extends Bike {
    String makeType;

    public void display() {
        System.out.println("TVS - Make: " + makeType + ", Cylinders: " + numCylinders + ", Gears: " + numGears +
                ", Cooling: " + coolingType + ", Wheels: " + wheelType + ", Tank: " + fuelTankSize + "L, Mileage: " + mileage + ", Price: ₹" + price);
    }
}
