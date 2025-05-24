import java.util.ArrayList;


public class MyCharStack {
    private ArrayList<Character> stack;
    public MyCharStack() {
        stack = new ArrayList<>();
    }
    public void push(char c) {
        stack.add(c);
    }
    public char pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty! Can't pop");
        }
        return stack.remove(stack.size() - 1);
    }

    public char peek() {
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
