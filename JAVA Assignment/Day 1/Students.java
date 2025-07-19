public class Students {
    public static void main(String[] args) {
        Students s = new Students();

//        Object obj = new String("hello");
//        s = new String("hi");
        if (s instanceof Students) {
            System.out.println(" s is an instance of Student class");
        } else {
            System.out.println(" s is NOT an instance of Student class");
        }

    }

}



