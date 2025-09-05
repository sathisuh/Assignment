package Three3D;

public class ThreeDMain {
    public static void main(String[] args) {
        ThreeD point1 = new ThreeD(); // default constructor
        point1.setX(1); point1.setY(2); point1.setZ(3);

        ThreeD point2 = new ThreeD(4, 6, 9); // parameterized constructor

        System.out.println("Distance between points: " + point1.distance(point2));
}
 }
