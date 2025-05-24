package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
        System.out.println("Xoá:" + queue.dequeue());
        queue.displayQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.displayQueue();
    }
}
