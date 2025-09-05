import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        // a. Append the specified element to the end of a hash set
        HashSet<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        System.out.println("Initial HashSet: " + set1);

        // b. Iterate through all elements in a hash set
        System.out.println("\nIterating through HashSet:");
        for (String color : set1) {
            System.out.println(color);
        }

        // c. Get the number of elements in a hash set
        System.out.println("\nSize of HashSet: " + set1.size());

        // d. Empty the hash set
        HashSet<String> tempSet = new HashSet<>(set1);  // Backup for further steps
        set1.clear();
        System.out.println("\nHashSet after clear(): " + set1);

        // e. Test if a hash set is empty
        System.out.println("Is HashSet empty? " + set1.isEmpty());

        // f. Clone a hash set to another hash set
        HashSet<String> clonedSet = (HashSet<String>) tempSet.clone();
        System.out.println("\nCloned HashSet: " + clonedSet);

        // g. Convert a hash set to an array
        String[] array = clonedSet.toArray(new String[0]);
        System.out.println("\nHashSet converted to Array:");
        for (String item : array) {
            System.out.println(item);
        }

        // h. Convert a hash set to a TreeSet
        TreeSet<String> treeSet = new TreeSet<>(clonedSet);
        System.out.println("\nHashSet converted to TreeSet (sorted): " + treeSet);

        // i. Convert a hash set to a List/ArrayList
        List<String> list = new ArrayList<>(clonedSet);
        System.out.println("\nHashSet converted to ArrayList: " + list);

        // j. Compare two hash sets
        HashSet<String> set2 = new HashSet<>();
        set2.add("Red");
        set2.add("Green");
        set2.add("Blue");

        boolean areEqual = clonedSet.equals(set2);
        System.out.println("\nAre clonedSet and set2 equal? " + areEqual);
    }
}