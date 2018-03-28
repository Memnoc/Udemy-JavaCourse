package Abstraction.practice3;

public class MyLinkedList {

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            System.out.println("The new appended element is: " + data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        System.out.println("The new element is: " + data);
    }

    public void deleteWithValue (int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("The deleted element is: " + data);
            }
            current = current.next;
        }
    }
}
