package Abstraction.myChallenge;

public class BookIterator {


    Library currentBook;
    Library previousBook;

    BookList theBook;

    public BookIterator(BookList theBook) {

        this.theBook = theBook;
        currentBook = theBook.firstNode;
        previousBook = theBook.lastNode;
    }

    public Library getCurrentBook() {
        return currentBook;
    }

    public Library getPreviousBook() {
        return previousBook;
    }

    public BookList getTheBook() {
        return theBook;
    }

    public boolean hasNext(){

        if (currentBook.next != null){
            return true;
        }
        return false;
    }

    public Library next(){

        if (hasNext()){


            previousBook = currentBook;
            currentBook = currentBook.next;
            return currentBook;
        }
        return null;
    }

    public void remove(){

        if (previousBook == null){
            theBook.firstNode = currentBook.next;
        } else {

            previousBook.next = currentBook.next;

            if (currentBook.next == null){
                currentBook = theBook.firstNode;
                previousBook = null;
            } else if (currentBook == null) {
                System.out.println("the list is empty");
            } else {
                currentBook = currentBook.next;

            }
        }

    }
}
