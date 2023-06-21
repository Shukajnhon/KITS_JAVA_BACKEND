package Day_03_Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        // Create a Map to store student names and their corresponding IDs
        Map<String, Integer> studentIds = new HashMap<>();

        // Add eles to map
        studentIds.put("John", 101);
        studentIds.put("Alice", 102);
        studentIds.put("Bob", 103);

        // Get the size of the map
        int size = studentIds.size();
        System.out.println("Size of the map: " + size);

        // Access eles in the map
        int johnId = studentIds.get("John");
        System.out.println("John's ID: " + johnId);

        // Check if the map contains a specific key
        boolean containsAlice = studentIds.containsKey("Alice");
        System.out.println("Does the map contain 'Alice'? " + containsAlice);

        // Iterate over the eles in the map
        System.out.println("Elements in the map");
        for (Map.Entry<String, Integer> entry : studentIds.entrySet()) {
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name + ", ID: " + id);
        }

        // Remove an ele from the map
        Integer removedId = studentIds.remove("Bob");
        System.out.println("Removed ID: " + removedId);
        System.out.println("Updated map: " + studentIds);

        // Clear all ele from the map
        // studentIds.clear();
        // System.out.println("Size of the map after clearing: " + studentIds.size());

    }
}
