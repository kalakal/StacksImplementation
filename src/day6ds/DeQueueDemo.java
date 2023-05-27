package day6ds;
import java.util.LinkedList;
import java.util.Queue;

public class DeQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue
        enqueue(queue, 56);
        enqueue(queue, 30);
        enqueue(queue, 70);

        // Dequeue elements from the queue until it is empty
        while (!queue.isEmpty()) {
            int dequeuedElement = dequeue(queue);
            System.out.println("Dequeued element: " + dequeuedElement);
        }
    }

    private static void enqueue(Queue<Integer> queue, int element) {
        ((LinkedList<Integer>) queue).addLast(element);
    }

    private static int dequeue(Queue<Integer> queue) {
        return ((LinkedList<Integer>) queue).removeFirst();
    }
}
