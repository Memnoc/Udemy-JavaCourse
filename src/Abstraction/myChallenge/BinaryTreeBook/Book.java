package Abstraction.myChallenge.BinaryTreeBook;

public class Book {

    public int shelfPosition;
    public String bookTitle;

    Book leftBook;
    Book rightBook;

    public Book(int shelfPosition, String bookTitle) {
        this.shelfPosition = shelfPosition;
        this.bookTitle = bookTitle;
    }

    public String toString() {
        return bookTitle + " has value " + shelfPosition;
    }
}
