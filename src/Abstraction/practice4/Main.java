package Abstraction.practice4;

public class Main {

    public static void main(String[] args) {

        BookList bookList = new BookList();

        bookList.sortInOrder("Moby Dick", 4);
        bookList.sortInOrder("Harry Potter", 6);
        bookList.sortInOrder("The Lord Of The Rings", 7);
        bookList.sortInOrder("The Dubliners", 9);

        bookList.insertAfterNode("Silence of the lambs", 10, 7);
        bookList.display();
        System.out.println("\n=====================================");

        BookIterator iterator = new BookIterator(bookList);
        System.out.println(iterator.getCurrentBook().toString());
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.getCurrentBook().toString());
        iterator.remove();
        System.out.println(iterator.getCurrentBook().toString());




    }

}
