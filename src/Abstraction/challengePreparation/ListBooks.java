package Abstraction.challengePreparation;

public abstract class ListBooks {


    ListBooks next;
    ListBooks previous;
    int data;

    public ListBooks(int data) {
        this.data = data;
    }

    abstract void append(int data);
    abstract ListBooks compareBooksTitle(String title);

    @Override
    public String toString() {
        return "" + data;
    }
}
