package queue;

public class Queue {
    public Node front = null;
    public Node rear = null;
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
            rear.link = front;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty!");
        }
        int value;
        if (front == rear) {
            value = front.data;
            front = rear = null;
        } else {
            value = front.data;
            front = front.link;
            rear.link = front;
        }
        return value;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue: ");
        Node temp = front;
        do {
            System.out.println(temp.data + "");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}
