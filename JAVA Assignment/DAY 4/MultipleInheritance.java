class A {
    void show() {
        System.out.println("Class A");
    }
}

// class B extends A, C { //  Compile-time Error - multiple inheritance not allowed in classes
class B {
    void display() {
        System.out.println("Class B");
    }
}

class C {
    void print() {
        System.out.println("Class C");
    }
}

// Uncommenting below will give compile-time error
// class D extends B, C {}

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance through classes.");
 }
}