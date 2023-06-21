package Day_03_Collection.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class demo {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add eles to queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        // Get size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Access the ele at the front of the queue without removing it
        String frontEle = queue.peek();
        System.out.println("Front ele of the queue: " + frontEle);

        // Process eles in the queue (remove them)
        // while (!queue.isEmpty()) {
        // String element = queue.poll();
        // System.out.println("Processing element: " + element);
        // }

        // check the size of the queue after processing
        System.out.println("Size of the queue after processing: " + queue.size());
    }
}
