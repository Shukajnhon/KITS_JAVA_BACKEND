package Day_03_Collection.HashSet_Classes;

import java.util.HashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numbers = new HashSet<>();

        // Add els to the HashSet
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);
        numbers.add(20); // Add a duplicate ele

        // Get the size of the HashSet
        int size = numbers.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterate over the els in the HashSet
        System.out.println("Elements in the HashSet");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an ele from the HashSet
        boolean removed = numbers.remove(20);
        System.out.println("Is 20 removed ? " + removed);
        System.out.println("Updated HashSet: " + numbers);

        // Check if the HashSet contains a specific ele
        boolean contains = numbers.contains(10);
        System.out.println("Does the HashSet contain 10 ? " + contains);

        // Clear all els from the HashSet
        // numbers.clear();
        // System.out.println("Size of the HashSet after clearing: " + numbers.size());

    }
}
