public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(5);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);


        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

    }
}
