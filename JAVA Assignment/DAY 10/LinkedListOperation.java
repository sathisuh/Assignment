import java.util.*;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // a. Append the specified element to the end of a linked list
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println("Initial LinkedList: " + list);

        // b. Iterate through all elements in a linked list
        System.out.println("\nIterating all elements:");
        for (String color : list) {
            System.out.println(color);
        }

        // c. Iterate from a specified position
        System.out.println("\nIterating from index 1:");
        Iterator<String> iteratorFromIndex = list.listIterator(1);
        while (iteratorFromIndex.hasNext()) {
            System.out.println(iteratorFromIndex.next());
        }

        // d. Iterate in reverse order
        System.out.println("\nIterating in reverse order:");
        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // e. Insert element at specified position
        list.add(1, "Yellow");
        System.out.println("\nAfter inserting 'Yellow' at index 1: " + list);

        // f. Insert elements at the first and last position
        list.addFirst("Black");
        list.addLast("White");
        System.out.println("\nAfter inserting at first and last positions: " + list);

        // g. Insert element at the front
        list.offerFirst("Orange");
        System.out.println("\nAfter inserting 'Orange' at the front: " + list);

        // h. Insert element at the end
        list.offerLast("Pink");
        System.out.println("\nAfter inserting 'Pink' at the end: " + list);

        // i. Insert some elements at a specified position
        List<String> newColors = Arrays.asList("Brown", "Gray");
        list.addAll(3, newColors);
        System.out.println("\nAfter inserting 'Brown' and 'Gray' at index 3: " + list);

        // j. Get first and last occurrence of specified elements
        list.add("Red");  // Add duplicate for testing
        System.out.println("\nList with duplicate 'Red': " + list);
        int firstIndex = list.indexOf("Red");
        int lastIndex = list.lastIndexOf("Red");
        System.out.println("First occurrence of 'Red': " + firstIndex);
        System.out.println("Last occurrence of 'Red': " + lastIndex);
    }
}