/*Can we override private method, constructor, static method,
final method? Illustrate with an example*/

class Parent {

    // Private method – NOT visible in child class
    private void privateMethod() {
        System.out.println("Parent's Private Method");
    }

    // Constructor – Cannot be overridden
    Parent() {
        System.out.println("Parent Constructor");
    }

    // Static method – Can be hidden, not overridden
    static void staticMethod() {
        System.out.println("Parent's Static Method");
    }

    // Final method – Cannot be overridden
    public final void finalMethod() {
        System.out.println("Parent's Final Method");
    }
}

    class Child extends Parent {

        // This is NOT overriding, it's a NEW method
        public void privateMethod() {
            System.out.println("Child's Private Method (New Method)");
        }

        // Static method – Hiding, not overriding
        static void staticMethod() {
            System.out.println("Child's Static Method (Hidden)");
        }

        // Constructor – Not overriding, just a constructor
        Child() {
            System.out.println("Child Constructor");
        }

        // Uncommenting below will cause COMPILE TIME ERROR
    /*
    public void finalMethod() {
        System.out.println("Trying to override final method");
    }
    */
    }

    public class OverrideCheck {
        public static void main(String[] args) {
            Parent obj1 = new Child(); // Upcasting

            System.out.println("--- Calling static method using Parent reference ---");
            obj1.staticMethod(); // Calls Parent's static method

            System.out.println("--- Calling final method ---");
            obj1.finalMethod(); // Final method from Parent

            System.out.println("--- Trying to call private method ---");
            // obj1.privateMethod(); //  Compile-time Error

            System.out.println("--- Creating Child object and calling its method ---");
            Child obj2 = new Child();
            obj2.privateMethod(); // Calls Child's new method
            obj2.staticMethod();  // Calls Child's static method
        }
    }

