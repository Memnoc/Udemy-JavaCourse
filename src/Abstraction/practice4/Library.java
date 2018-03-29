package Abstraction.practice4;

public abstract class Library {

    protected String bookTitle;
    protected int bookScaffold;

    public Library next;
    public Library previous;

    public Library(String bookTitle, int bookPosition) {
        this.bookTitle = bookTitle;
        this.bookScaffold = bookPosition;
    }

    public Library() {

    }

    public abstract void display();

    public abstract String toString();
}
