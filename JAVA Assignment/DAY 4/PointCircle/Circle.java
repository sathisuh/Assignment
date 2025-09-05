package PointCircle;

class Circle extends Point {
    private int radius;

    public Circle() {
        super();
        radius = 1;
    }

    public void setRadius(int radius) {
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

    public int getRadius() { return radius; }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void display() {
        System.out.println("Circle center is (" + getX() + "," + getY() + ")");
        System.out.println("Radius is " + radius);
        System.out.println("Area is " + area());
    }
}
