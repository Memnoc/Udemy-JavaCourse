package Abstraction.practice;

public class Node {


    int data; // Type of data stored by the Node
    Node nextNode; // Node pointer

    public Node(int data) {
        this.data = data;
    }

    public Node() {

    }

    @Override
    public String toString() {
        return "" + data;
    }
}
