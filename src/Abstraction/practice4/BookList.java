package Abstraction.practice4;

public class BookList extends Library implements IBook {

    Library firstNode;
    Library lastNode;


    public BookList(String bookTitle, int bookShelfPosition) {
        super(bookTitle, bookShelfPosition);
    }

    public BookList() {

    }


    @Override
    public void insertFirstElement(String title, int scaffold) {

        BookList newBook = new BookList(title, scaffold);

        if (isEmpty()) {
            lastNode = newBook;
        } else {
            firstNode.previous = newBook;
        }

        newBook.next = firstNode;
        firstNode = newBook;

    }

    @Override
    public void insertLastElement(String title, int shelf) {
        BookList newBook = new BookList(title, shelf);


        if (isEmpty()) {
            firstNode = newBook;
        } else {
            lastNode.next = newBook;
            newBook.previous = lastNode;

        }
        lastNode = newBook;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null);
    }

    @Override
    public boolean insertAfterNode(String title, int shelf, int key) {
        BookList newBook = new BookList(title, shelf);
        BookList currentBook = (BookList)firstNode;

        while (currentBook.bookShelf != key) {
            currentBook = (BookList)currentBook.next;

            if (currentBook == null) {
                return false;
            }
        }

        if (currentBook == lastNode) {

            newBook.next = null;
            lastNode = newBook;
        } else {

            newBook.next = currentBook.next;
            currentBook.next.previous = newBook;
        }

        newBook.previous = currentBook;
        currentBook.next = newBook;
        return true;

    }

    @Override
    public void sortInOrder(String title, int position) {

        BookList newBook = new BookList(title, position);

        BookList previousBook = null;
        BookList currentBook = (BookList)firstNode;

        while ((currentBook != null) && (position > currentBook.bookShelf)) {

            previousBook = currentBook;
            currentBook = (BookList)currentBook.next;

        }

        if (previousBook == null){
            firstNode = newBook;
        } else {
            previousBook.next = newBook;

        }

        newBook.next = currentBook;



    }


    @Override
    public void display() {
        Library theLibrary = firstNode;

        while (theLibrary != null) {

            System.out.println("Current Book: " + theLibrary + "\nNext Book: " + theLibrary.next);
            theLibrary = theLibrary.next;
            System.out.println();

        }
    }

    @Override
    public String toString() {
        return bookTitle + " " + String.valueOf(bookShelf);
    }
}
