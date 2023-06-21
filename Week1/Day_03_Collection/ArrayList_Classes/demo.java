package Day_03_Collection.ArrayList_Classes;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add eles to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Access eles in the ArrayList
        int firstNumber = numbers.get(0);
        System.out.println("First Number: " + firstNumber);

        // Modify eles in the ArrayList
        numbers.set(1, 25);
        System.out.println("Modified ArrayList: " + numbers);

        // Iterate over the eles in the ArrayList
        System.out.println("Elements in the ArrayList");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an ele from the ArrayList
        boolean removed = numbers.remove(Integer.valueOf(30));

        System.out.println("Is 30 removed ? " + removed);
        System.out.println("Updated ArrayList: " + numbers);

        // check if ArrayList contains a specific element
        boolean contains = numbers.contains(20);
        System.out.println("Does the ArrayList contain 20 ? " + contains);

        // clear all eles form the ArrayList
        // numbers.clear();
        // System.out.println("Size of the ArrayList after clearing: " +
        // numbers.size());

    }
}
