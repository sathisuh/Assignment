public class scopeofvariables {
    static int staticVar = 2;
    int instanceVar = 3;

    public void display() {
        final int finalVar = 22;
        int localVar = 56;


        if (true) {
            int blockVar = 50;
            System.out.println("block Var:" + blockVar);
        }
        System.out.println("local:" + localVar + " " + "Final:" + finalVar);
    }

    public static void main(String[] args) {
        scopeofvariables obj = new scopeofvariables();
        obj.display();
        System.out.println("static:" + staticVar + " " + "instance:" + obj.instanceVar);
    }
}
