package Day_03_Collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a c Collection (ArrayList) of integers
        // Collection<Integer> numbers = new ArrayList<>();
        Collection<Integer> numbers = new ArrayList<>();

        // Add elements to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get the size of the collection
        int size = numbers.size();
        System.out.println("Size of the collection: " + size);

        // Check if the collection is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);

        // Integer over the elements in the collection
        System.out.println("Elements in the collection: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an element from the collection
        boolean removed = numbers.remove(20);
        // int removed = numbers.remove);

        System.out.println("Is 20 removed? " + removed);

        // clear all ele
        // numbers.clear();

    }
}
