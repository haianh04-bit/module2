import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseIntergerStack {
    public static void reverse(LinkedList<Integer> list) {
        MyIntergerStack stack = new MyIntergerStack();
        for (Integer i : list) {
            stack.push(i);
        }
        for (int i = 0 ; i < list.size() ; i++) {
            list.set(i, (Integer) stack.pop());
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        System.out.println("Trước khi đảo: " + list);
        reverse(list);
        System.out.println("Sau khi đảo: " + list);
    }

}
