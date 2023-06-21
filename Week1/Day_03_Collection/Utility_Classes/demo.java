package Day_03_Collection.Utility_Classes;

import java.util.ArrayList;

import java.util.List;

public class demo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Add number
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        // Use Collection utility methods
        System.out.println("Original list: " + numbers);

        // Sort the list in ascending order
        // Collection.sort()
    }
}
