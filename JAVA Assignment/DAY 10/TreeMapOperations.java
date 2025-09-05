import java.util.*;

public class TreeMapOperations {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a TreeMap
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(3, "Red");
        map1.put(1, "Green");
        map1.put(2, "Blue");
        map1.put(4, "Yellow");
        System.out.println("1. TreeMap after inserting key-value pairs: " + map1);

        // 2. Copy a TreeMap content to another TreeMap
        TreeMap<Integer, String> map2 = new TreeMap<>(map1);
        System.out.println("\n2. Copied TreeMap: " + map2);

        // 3. Search a key in a TreeMap
        int searchKey = 2;
        if (map1.containsKey(searchKey)) {
            System.out.println("\n3. Key " + searchKey + " found with value: " + map1.get(searchKey));
        } else {
            System.out.println("\n3. Key " + searchKey + " not found.");
        }

        // 4. Search a value in a TreeMap
        String searchValue = "Yellow";
        if (map1.containsValue(searchValue)) {
            System.out.println("\n4. Value '" + searchValue + "' found in the TreeMap.");
        } else {
            System.out.println("\n4. Value '" + searchValue + "' not found.");
        }

        // 5. Get all keys from the TreeMap
        Set<Integer> keys = map1.keySet();
        System.out.println("\n5. All keys in the TreeMap: " + keys);

        // 6. Delete all elements from a TreeMap
        TreeMap<Integer, String> tempMap = new TreeMap<>(map1); // backup
        map1.clear();
        System.out.println("\n6. TreeMap after clear(): " + map1);

        // 7. Sort keys using Comparator (Descending order)
        TreeMap<Integer, String> sortedDesc = new TreeMap<>(Collections.reverseOrder());
        sortedDesc.putAll(tempMap);
        System.out.println("\n7. TreeMap sorted by descending key order: " + sortedDesc);

        // 8. Get key-value mapping with greatest and least key
        Map.Entry<Integer, String> greatest = tempMap.lastEntry();
        Map.Entry<Integer, String> least = tempMap.firstEntry();
        System.out.println("\n8. Greatest key mapping: " + greatest);
        System.out.println("   Least key mapping: " + least);

        // 9. Get first (lowest) and last (highest) key
        System.out.println("\n9. First key: " + tempMap.firstKey());
        System.out.println("   Last key: " + tempMap.lastKey());

        // 10. Reverse order view of keys
        NavigableSet<Integer> reverseKeys = tempMap.descendingKeySet();
        System.out.println("\n10. Reverse order of keys: " + reverseKeys);
    }
}
