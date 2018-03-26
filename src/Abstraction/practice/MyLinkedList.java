package Abstraction.practice;

public class MyLinkedList {

    //  head                                          tail
    //   |                                             |
    // Node (data) -> Node (data) -> Node (data) -> Node (data)
    // Add Node
    // Delete Node
    // Find Node

    int size = 0;
    Node head;
    Node tail;

    // Things to know when adding a Node:
    // 1 - Data type (Node node)
    // 2 - A start point (Node head)
    // 3 - An end (Node tail)
    public void add(int data) {

        Node node = new Node(data);

        // scenario 1 = empty LinkedList
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            // scenario 2 = non-empty LinkedList -> add Node(10) [Node (15) -> Node (16)]
            //                                      [Node (15) -> Node (16) -> Node (10)]
            tail.nextNode = node; // pointing tail to the new node (10)
            tail = node; // updating the old tail to the previous node
        }
        size++;
    }

    public Node delete(int data) {
        // scenario 1: empty LinkedList
        // scenario 2: non-empty LinkedList
        // delete Node (10) [Node (15) -> Node (16) -> Node (10)]
        // We need to go through the list, find Node 10, then delete it
        // We need to implement a find method. However, there are more scenarios to think about.
        // scenario 3: delete element at tail
        // scenario 4: delete element at head
        // scenario 5: delete element in middle of list
        Node nodeToReturn = null;

        if (size == 0)
        return null;
        if (size == 1)
        {
            nodeToReturn = head;
            head = null;
            tail = null;
            size --;
            }
            Node node = findNodeBefore(data);
        if (node != null) {
            if (tail == node)
            {

            }
            size --;


        }
        return null;

    }

    /**
     * If this method returns null it means that the element we want to delete is t the head of the LinkedList
     * If this method returns an empty Node it means that the element we want to delete is at the head of the list
     * @param data
     * @return
     */

    public Node findNodeBefore(int data) {

        if (head == null)
            return null;

        // check first element for a match
        if (head.data == data)
            return new Node();

        // assign Node as the iterator
        Node node = head;

        // iterate through our LinkedList
        while (node.nextNode != null)
        {
            node = node.nextNode;
            if (node.data == data)
                return node;
        }

        return null;

    }

    public Node find(int data) {
        // scenario 1: empty LinkedList
        // scenario 2: non-empty LinkedList

        if (head == null)
            return null;

        // check first element for a match
        if (head.data == data)
            return head;

        // assign Node as the iterator
        Node node = head;

        // iterate through our LinkedList
        while (node.nextNode != null)
        {
            node = node.nextNode;
            if (node.data == data)
                return node;
        }

        return null;
    }
}
