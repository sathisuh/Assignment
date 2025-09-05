import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Blue");
        map1.put(4, "Yellow");
        System.out.println("1. HashMap after adding key-value pairs: " + map1);

        // 2. Count the number of key-value mappings (size)
        System.out.println("\n2. Size of the HashMap: " + map1.size());

        // 3. Copy all mappings to another map
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("\n3. Copied HashMap: " + map2);

        // 4. Remove all mappings from map1
        map1.clear();
        System.out.println("\n4. map1 after clear(): " + map1);

        // 5. Check if map1 is empty
        System.out.println("\n5. Is map1 empty? " + map1.isEmpty());

        // 6. Get a shallow copy of HashMap (clone)
        HashMap<Integer, String> map3 = (HashMap<Integer, String>) map2.clone();
        System.out.println("\n6. Cloned (shallow copy) HashMap: " + map3);

        // 7. Test if map contains a mapping for specified key
        int keyToSearch = 3;
        boolean hasKey = map2.containsKey(keyToSearch);
        System.out.println("\n7. Does map2 contain key " + keyToSearch + "? " + hasKey);

        // 8. Test if map contains a mapping for specified value
        String valueToSearch = "Yellow";
        boolean hasValue = map2.containsValue(valueToSearch);
        System.out.println("\n8. Does map2 contain value '" + valueToSearch + "'? " + hasValue);

        // 9. Create a set view of the mappings (entry set)
        Set<Map.Entry<Integer, String>> entrySet = map2.entrySet();
        System.out.println("\n9. Set view of map2 entries:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 10. Get the value for a specified key
        int lookupKey = 2;
        String value = map2.get(lookupKey);
        System.out.println("\n10. Value for key " + lookupKey + ": " + value);
    }
}