/*Construct a base class called twoD contains x and y and methods to read and write the x and y.
Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z.
Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/

package Vehicle;
public class VehicleMain {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.modelType = "A6";
        a.ownershipCost = 1200000;
        a.warranty = 5;
        a.seatingCapacity = 5;
        a.fuelType = "Petrol";
        a.mileage = 15;
        a.price = 4500000;
        a.display();

        Ford f = new Ford();
        f.modelType = "Mustang";
        f.ownershipCost = 900000;
        f.warranty = 4;
        f.seatingCapacity = 4;
        f.fuelType = "Petrol";
        f.mileage = 12;
        f.price = 6000000;
        f.display();

        Bajaj b = new Bajaj();
        b.makeType = "Pulsar";
        b.numCylinders = 1;
        b.numGears = 5;
        b.coolingType = "Air";
        b.wheelType = "Alloys";
        b.fuelTankSize = 15;
        b.mileage = 50;
        b.price = 120000;
        b.display();

        TVS t = new TVS();
        t.makeType = "Apache";
        t.numCylinders = 1;
        t.numGears = 5;
        t.coolingType = "Oil";
        t.wheelType = "Spokes";
        t.fuelTankSize = 12;
        t.mileage = 55;
        t.price = 100000;
        t.display();
   }
}
