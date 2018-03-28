package Abstraction.practice3;

public class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        System.out.println(data);
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
