package day6ds;
import java.util.LinkedList;
public class StackDemo {
    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();

        // Adding elements to the stack
        stack.push(56);
        stack.push(30);
        stack.push(70);

        // Peeking and popping elements from the stack until it is empty
        while (!stack.isEmpty()) {
            // Peeking the top element
            int topElement = stack.peek();
            System.out.println("Peek: " + topElement);

            // Popping the top element
            int poppedElement = stack.pop();
            System.out.println("Pop: " + poppedElement);
        }
    }
}





