package Abstraction.BinaryTree;

// This could be linked to an interface

public class Node {

    public int value;
    public String name;

    Node leftChild;
    Node rightChild;

    public Node(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String toString() {
        return name + " has value " + value;
    }
}
