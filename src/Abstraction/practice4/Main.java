package Abstraction.practice4;

import Abstraction.practice4.BinaryTreeBook.BookTree;

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


        /**
         * Binary Tree
         */

        BookTree tree = new BookTree();

        tree.addNode(50, "Boss");
        tree.addNode(25, "Vice President");
        tree.addNode(15, "Office Manager");
        tree.addNode(30, "Secretary");
        tree.addNode(75, "Sales Manager");
        tree.addNode(85, "Salesman1");

        System.out.println("==========IN-ORDER TRAVERSAL===========");
        tree.inOrderTraverseTree(tree.root);
        System.out.println();
        System.out.println("==========PRE-ORDER TRAVERSAL===========");
        tree.preorderTraversalTree(tree.root);
        System.out.println();
        System.out.println("==========POST-ORDER TRAVERSAL===========");
        tree.postOrderTraversalTree(tree.root);

        /**
         *
         * OUTPUT
         *
         * ==========IN-ORDER TRAVERSAL===========
         Office Manager has value 15
         Vice President has value 25
         Secretary has value 30
         Boss has value 50
         Sales Manager has value 75
         Salesman1 has value 85

         ==========PRE-ORDER TRAVERSAL===========
         Boss has value 50
         Vice President has value 25
         Office Manager has value 15
         Secretary has value 30
         Sales Manager has value 75
         Salesman1 has value 85

         ==========POST-ORDER TRAVERSAL===========
         Office Manager has value 15
         Secretary has value 30
         Vice President has value 25
         Salesman1 has value 85
         Sales Manager has value 75
         Boss has value 50
         */

        /**
         * SEARCH FOR A NODE
         */
        System.out.println("Search for 30");
        System.out.println(tree.findNode(30));

        /**
         *
         *
         * OUTPUT
         *
         * Search for 30
         Secretary has value 30
         */

        /**
         * REMOVE A NODE
         */
        System.out.println("Remove value 25");
        System.out.println(tree.remove(25));
        tree.preorderTraversalTree(tree.root);

        /**
         * Output: value 25 has been removed
         *
         * Remove value 25
         true
         Boss has value 50
         Secretary has value 30
         Sales Manager has value 75
         Salesman1 has value 85
         */




    }

}
