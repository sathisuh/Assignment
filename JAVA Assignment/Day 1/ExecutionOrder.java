public class ExecutionOrder {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Initializer Block");
    }

    public ExecutionOrder() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new ExecutionOrder();
        new ExecutionOrder();
    }
}


