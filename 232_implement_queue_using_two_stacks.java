import java.util.Stack;

public class Main {

    public static void main(String[] args) {
    }
}

class MyQueue {

    private final Stack<Integer> input;
    private final Stack<Integer> output;

    private int front;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        if (input.isEmpty()) {
            front = x;
        }
        input.push(x);
    }

    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if (!output.isEmpty()) {
            return output.peek();
        }
        return front;
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
