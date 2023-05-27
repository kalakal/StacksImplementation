package day6ds;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue
        enqueue(queue, 56);
        enqueue(queue, 30);
        enqueue(queue, 70);

        // Print the queue
        System.out.println("Queue: " + queue);
    }

    private static void enqueue(Queue<Integer> queue, int element) {
        ((LinkedList<Integer>) queue).addLast(element);
    }
}
