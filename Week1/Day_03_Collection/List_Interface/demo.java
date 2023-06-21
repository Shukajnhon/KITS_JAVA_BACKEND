package Day_03_Collection.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        // create a List of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get size of list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Access elements in the List
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modified elements in the list
        fruits.set(1, "Mango");
        System.out.println("Modified list: " + fruits);

        // Iterate over the elements in the list
        System.out.println("Eles in the list");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an ele from the list
        boolean remove = fruits.remove("Orange");
        System.out.println("Is Orange removed? " + remove);
        System.out.println("Updated list: " + fruits);

        // Check if the list contains a specific ele
        boolean contains = fruits.contains("Banana");
        System.out.println("Does the list contain 'Banana' ?" + contains);

        // clear all eles
        // fruits.clear();
        // System.out.println("Size of the list after clear: "+ fruits.size());

    }
}
