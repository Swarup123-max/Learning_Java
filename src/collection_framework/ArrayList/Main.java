package ArrayList;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Initial ArrayList: " + fruits);

        // 2. Access elements using index
        System.out.println("Element at index 2: " + fruits.get(2));

        // 3. Update elements
        fruits.set(1, "Blueberry");
        System.out.println("After updating index 1: " + fruits);

        // 4. Remove elements
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);

        // 5. Size of ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // 6. Check if list contains an element
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Orange'? " + fruits.contains("Orange"));

        // 7. Check if ArrayList is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());

        // 8. Iterate over the ArrayList
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Clear the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);
        System.out.println("Is the list empty now? " + fruits.isEmpty());
    }
}
