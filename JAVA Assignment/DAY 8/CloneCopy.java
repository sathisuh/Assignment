/*Write a program to illustrate the usage of clone() and find out what kind of copy it will make.*/

class Person implements Cloneable {
    String name;

    Person(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class CloneCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John");
        Person p2 = (Person) p1.clone();

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.name = "Mike";

        System.out.println(p1.name); // Still John
        System.out.println(p2.name); // Mike
    }
}