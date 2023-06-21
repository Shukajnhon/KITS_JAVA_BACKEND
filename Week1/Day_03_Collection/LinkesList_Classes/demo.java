package Day_03_Collection.LinkesList_Classes;

import java.util.LinkedList;

public class demo {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Add els to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the LinkedList: " + size);

        // Access els in the LinkedList
        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);

        // Modify els in the LinkedList
        names.set(1, "Eve");
        System.out.println("Modified LinkedList: " + names);

        // Iterate over the els in the LinkedList
        System.out.println("Elements in the LinkedList: ");
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an ele from the LinkedList
        boolean removed = names.remove("Charlie");
        System.out.println("Is 'Charlie' removed? " + removed);
        System.out.println("Updated LinkedList: " + names);

        // check if LinkedList contains a specific element
        boolean contains = names.contains("Bob");
        System.out.println("Does the LinkedList contain 'Bob'? " + contains);

        // clear all els from the LinkedList
        // names.clear();
        // System.out.println("Size of the LinkedList after clearing: " + names.size());
    }
}
