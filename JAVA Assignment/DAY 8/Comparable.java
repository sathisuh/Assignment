/*evelop a Java program which illustrates the usage of Comparable Interface.*/

import java.util.*;

class Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Comparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "Ram"));
        list.add(new Employee(1, "Anu"));
        list.add(new Employee(2, "Kiran"));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}