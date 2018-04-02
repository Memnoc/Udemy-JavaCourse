package Abstraction.myChallenge;

public abstract class Library {

    protected String bookTitle;
    protected int bookShelf;

    public Library next;
    public Library previous;

    protected Object value;

    public Library(String bookTitle, int bookPosition) {
        this.bookTitle = bookTitle;
        this.bookShelf = bookPosition;
    }

    public Library() {

    }


    public abstract void display();
    public abstract String toString();
}
