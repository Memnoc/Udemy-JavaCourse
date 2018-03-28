package Abstraction.practice4;

import java.awt.print.Book;

public class BookList extends Library implements IBook {

    Library firstNode;
    Library lastNode;

    public BookList(String bookTitle, int bookScaffoldPosition) {
        super(bookTitle, bookScaffoldPosition);
    }

    public BookList() {

    }


    @Override
    public void insertFirstElement(String title, int scaffold) {

        BookList newBook = new BookList(title, scaffold);

        if (isEmpty()){
            lastNode = newBook;
        }

        newBook.next = firstNode;
        firstNode = newBook;

    }

    @Override
    public void insertLastElement(String title, int scaffold) {
        BookList newBook = new BookList(title, scaffold);


        if (isEmpty()){
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
    public void display() {
        Library theLibrary = firstNode;

        while (theLibrary != null){

            theLibrary.display();
            System.out.println("Next Link: " + theLibrary.next);
            theLibrary = theLibrary.next;
            System.out.println();

        }
    }
}
