class Shape {
    void printType() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    void printType() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    void printType() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    void printType() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle {
    void printType() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        new Shape().printType();
        new Polygon().printType();
        new Rectangle().printType();
        new Triangle().printType();
        new Square().printType();
    }
}