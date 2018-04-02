package Abstraction.myChallenge;

import Abstraction.myChallenge.BinaryTreeBook.BookTree;

public class Main {

    public static void main(String[] args) {

//        BookList bookList = new BookList();
//        bookList.insertLastElement("Divina Commedia", 11);
//        bookList.sortInOrder("Moby Dick", 4);
//        bookList.sortInOrder("Harry Potter", 6);
//        bookList.sortInOrder("The Lord Of The Rings", 7);
//        bookList.sortInOrder("The Dubliner", 9);
//        bookList.insertAfterNode("Silence of the lambs", 10, 7);
//        bookList.display();
//        System.out.println("\n=====================================");

//        BookIterator iterator = new BookIterator(bookList);
//        System.out.println(iterator.getCurrentBook().toString());
//        System.out.println(iterator.hasNext());
//        iterator.next();
//        System.out.println(iterator.getCurrentBook().toString());
//        iterator.remove();
//        iterator.remove();
//        System.out.println(iterator.getCurrentBook().toString());



        /**
         * Binary Tree
         */
        System.out.println("=============Binary Tree===============");

        BookTree tree = new BookTree();

        tree.addNode(6, "Harry Potter");
        tree.addNode(6, "Harry Potter");// testing the duplication-free mechanism
        tree.addNode(7, "The Lord of the Rings");
        tree.addNode(9, "Dubliners");
        tree.addNode(11, "Les Miserables");
        tree.addNode(44, "Another Book");
        tree.inOrderTraverseTree(tree.root);
        System.out.println();
        tree.remove( 71);
        tree.remove(44);
        System.out.println();
        tree.inOrderTraverseTree(tree.root);









//        System.out.println("==========IN-ORDER TRAVERSAL===========");
//        tree.inOrderTraverseTree(tree.root);
//        System.out.println();
//        System.out.println("==========PRE-ORDER TRAVERSAL===========");
//        tree.preorderTraversalTree(tree.root);
//        System.out.println();
//        System.out.println("==========POST-ORDER TRAVERSAL===========");
//        tree.postOrderTraversalTree(tree.root);
//
//        /**
//         *
//         * OUTPUT
//         *
//         ==========IN-ORDER TRAVERSAL===========
//         Moby Dick has value 4
//         Harry Potter has value 6
//         The Lord of the Rings has value 7
//         Dubliners has value 9
//
//         ==========PRE-ORDER TRAVERSAL===========
//         Moby Dick has value 4
//         Harry Potter has value 6
//         The Lord of the Rings has value 7
//         Dubliners has value 9
//
//         ==========POST-ORDER TRAVERSAL===========
//         Dubliners has value 9
//         The Lord of the Rings has value 7
//         Harry Potter has value 6
//         Moby Dick has value 4
//         */
//
//        /**
//         * SEARCH FOR A NODE
//         */
//        System.out.println("Search for 4");
//        System.out.println(tree.findNode(4));
//
//        /**
//         *
//         *
//         * OUTPUT
//         *
//         Search for 4
//         Moby Dick has value 4
//         */
//
//        /**
//         * REMOVE A NODE
//         */
//        System.out.println("Remove book 9");
//        System.out.println(tree.remove(9));
//        tree.preorderTraversalTree(tree.root);
//
//        /**
//         * Output: value 9 has been removed
//         *
//         Remove book 9
//         true
//         Moby Dick has value 4
//         Harry Potter has value 6
//         The Lord of the Rings has value 7
//         */




    }

}
