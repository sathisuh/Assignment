/*Develop a Java program which illustrates the usage of Comparator Interface.*/

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameComparator implements java.util.Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Comparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Viji"));
        list.add(new Student(1, "Monica"));
        list.add(new Student(2, "Trisha"));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
