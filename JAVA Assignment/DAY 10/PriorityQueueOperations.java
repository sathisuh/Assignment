import java.util.*;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        // 1. Create a new priority queue, add some colors, and print elements
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Blue");
        pq1.add("Yellow");

        System.out.println("1. PriorityQueue elements: " + pq1);

        // 2. Iterate through all elements in priority queue
        System.out.println("\n2. Iterating through PriorityQueue:");
        for (String color : pq1) {
            System.out.println(color);
        }

        // 3. Add all elements of one priority queue to another
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Black");
        pq2.add("White");
        pq2.addAll(pq1);
        System.out.println("\n3. New PriorityQueue after adding all from pq1: " + pq2);

        // 4. Insert a given element
        pq2.add("Orange");
        System.out.println("\n4. After inserting 'Orange': " + pq2);

        // 5. Remove all elements
        PriorityQueue<String> temp = new PriorityQueue<>(pq2);  // Keep a backup
        pq2.clear();
        System.out.println("\n5. PriorityQueue after clear(): " + pq2);

        // 6. Count elements in a priority queue
        System.out.println("\n6. Number of elements in original pq1: " + pq1.size());

        // 7. Compare two priority queues
        PriorityQueue<String> pq3 = new PriorityQueue<>(pq1);
        boolean areEqual = pq1.equals(pq3);
        System.out.println("\n7. Are pq1 and pq3 equal? " + areEqual);

        // 8. Retrieve the first element (head of the queue)
        String head = pq1.peek();
        System.out.println("\n8. Head of pq1 (without removing): " + head);

        // 9. Retrieve and remove the first element
        String removedHead = pq1.poll();
        System.out.println("9. Head removed from pq1: " + removedHead);
        System.out.println("   Remaining pq1: " + pq1);

        // 10. Convert priority queue to array
        Object[] array = pq1.toArray();
        System.out.println("\n10. PriorityQueue converted to array:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}