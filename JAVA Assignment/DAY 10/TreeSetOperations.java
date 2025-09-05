
import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        // a. Create a new TreeSet, add some colours (strings), and print
        TreeSet<String> colorSet1 = new TreeSet<>();
        colorSet1.add("Red");
        colorSet1.add("Green");
        colorSet1.add("Blue");
        colorSet1.add("Yellow");
        System.out.println("a. TreeSet of colors: " + colorSet1);

        // b. Iterate through all elements in a TreeSet
        System.out.println("\nb. Iterating through TreeSet:");
        for (String color : colorSet1) {
            System.out.println(color);
        }

        // c. Add all elements of one TreeSet to another
        TreeSet<String> colorSet2 = new TreeSet<>();
        colorSet2.add("Black");
        colorSet2.add("White");
        colorSet2.addAll(colorSet1);
        System.out.println("\nc. Combined TreeSet: " + colorSet2);

        // d. Reverse order view of the TreeSet
        System.out.println("\nd. Reverse order view:");
        Iterator<String> reverseIterator = colorSet1.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // e. Get the first and last elements
        System.out.println("\ne. First element: " + colorSet1.first());
        System.out.println("   Last element: " + colorSet1.last());

        // f. Clone TreeSet
        TreeSet<String> clonedSet = (TreeSet<String>) colorSet1.clone();
        System.out.println("\nf. Cloned TreeSet: " + clonedSet);

        // g. Number of elements
        System.out.println("\ng. Number of elements in TreeSet: " + colorSet1.size());

        // h. Compare two TreeSets
        boolean areEqual = colorSet1.equals(colorSet2);
        System.out.println("\nh. Are colorSet1 and colorSet2 equal? " + areEqual);

        // Create TreeSet of numbers for i - p
        TreeSet<Integer> numberSet = new TreeSet<>(Arrays.asList(1, 2, 3, 5, 7, 8, 10, 12));

        // i. Find numbers less than 7
        System.out.println("\ni. Numbers less than 7: " + numberSet.headSet(7));

        // j. Element >= 5
        System.out.println("j. Element >= 5: " + numberSet.ceiling(5));

        // k. Element <= 5
        System.out.println("k. Element <= 5: " + numberSet.floor(5));

        // l. Strictly > 5
        System.out.println("l. Element > 5: " + numberSet.higher(5));

        // m. Strictly < 5
        System.out.println("m. Element < 5: " + numberSet.lower(5));

        // n. Retrieve and remove first element
        Integer firstRemoved = numberSet.pollFirst();
        System.out.println("n. First element removed: " + firstRemoved);
        System.out.println("   TreeSet after removing first: " + numberSet);

        // o. Retrieve and remove last element
        Integer lastRemoved = numberSet.pollLast();
        System.out.println("o. Last element removed: " + lastRemoved);
        System.out.println("   TreeSet after removing last: " + numberSet);

        // p. Remove a specific element
        boolean removed = numberSet.remove(7);
        System.out.println("p. Is 7 removed from TreeSet? " + removed);
        System.out.println("   TreeSet after removing 7: " + numberSet);
    }
}