package Abstraction.practice4;

public abstract class Library {

    public String bookTitle;
    public int bookScaffold;

    public Library next;
    public Library previous;

    public Library(String bookTitle, int bookPosition) {
        this.bookTitle = bookTitle;
        this.bookScaffold = bookPosition;
    }

    public Library() {

    }

    public void display() {
        System.out.println(bookTitle + ": " + bookScaffold);
    }


    public String toString() {
        return bookTitle;
    }
}
