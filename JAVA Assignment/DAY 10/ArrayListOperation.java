import java.util.*;

public class ArrayListOperation {
    public static void main(String[] args) {
        // a. Create a new array list, add some colours (strings), and print the collection
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Original Colors List: " + colors);

        // b. Iterate through all elements in an array list
        System.out.println("\nIterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // c. Insert an element at the first position
        colors.add(0, "Purple");
        System.out.println("\nAfter inserting 'Purple' at first position: " + colors);

        // d. Retrieve an element (at a specified index)
        String colorAtIndex2 = colors.get(2);
        System.out.println("\nElement at index 2: " + colorAtIndex2);

        // e. Update specific array element by given element
        colors.set(3, "Black");
        System.out.println("\nAfter updating element at index 3 to 'Black': " + colors);

        // f. Remove the third element from the array list (index starts from 0)
        colors.remove(2);
        System.out.println("\nAfter removing 3rd element (index 2): " + colors);

        // g. Search an element in an array list
        String searchColor = "Green";
        if (colors.contains(searchColor)) {
            System.out.println("\nElement '" + searchColor + "' found at index: " + colors.indexOf(searchColor));
        } else {
            System.out.println("\nElement '" + searchColor + "' not found in the list.");
        }

        // h. Sort a given array list
        Collections.sort(colors);
        System.out.println("\nSorted Colors List: " + colors);

        // i. Copy one array list into another
        ArrayList<String> copiedList = new ArrayList<>(colors);
        System.out.println("\nCopied List: " + copiedList);

        // j. Shuffle elements in an array list
        Collections.shuffle(colors);
        System.out.println("\nShuffled Colors List: " + colors);
    }
}
