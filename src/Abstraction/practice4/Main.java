package Abstraction.practice4;

public class Main {

    public static void main(String[] args) {

        BookList bookList = new BookList();

        bookList.insertFirstElement("Moby Dick", 34);
        bookList.insertFirstElement("Harry Potter", 4);
        bookList.insertFirstElement("The Lord Of The Rings", 19);
        bookList.insertLastElement("Memnoc The Devil", 51);
        bookList.insertFirstElement("The Dubliners", 1);

//        https://www.youtube.com/watch?v=iR5wyCaIayk

        bookList.display();


    }

}
