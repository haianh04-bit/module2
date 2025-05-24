import java.util.LinkedList;


public class MyIntergerStack {
    private LinkedList<Integer> stack;
    public MyIntergerStack() {
        stack = new LinkedList<>();
    }
    public void push(int n) {
        stack.addFirst(n);
    }
    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty! Can't pop");
        }
        return stack.remove(stack.size() - 1);
    }
    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty! Can't peek");
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
}
