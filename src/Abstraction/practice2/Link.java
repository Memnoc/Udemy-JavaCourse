package Abstraction.practice2;

public class Link {

    public String bookName; // Linked list group of books
    public int millionSold; // Each link will have a name and the million of copies sold

    public Link next; // creating new Link object

    public Link(String bookName, int millionSold) {
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

    public void display() {

        System.out.println(bookName + ": " + millionSold + " ,000,000");
    }

    @Override
    public String toString() {
        return bookName;
    }
}
