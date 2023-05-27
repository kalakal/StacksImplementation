package day6ds;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        stack.push(56);
        stack.push(30);
        stack.push(70);

        // Printing the stack
        System.out.println("Stack: " + stack);
    }
}
