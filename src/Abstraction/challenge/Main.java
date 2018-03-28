package Abstraction.challenge;

public class Main {

    public static void main(String[] args) {

        Books books = new Books(1);
        Books books2 = new Books(2);
        Books books3 = new Books(3);
        Books books4 = new Books(4);
        Books books5 = new Books(5);
        books.append(1);
        books.deleteWithValue(1);
//        System.out.println(books.toString());

    }
}
