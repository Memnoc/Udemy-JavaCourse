package Abstraction.practice4.BinaryTreeBook;

public class BookTree {

    // every tree must have a root value
    public Book root;

    /**
     * ADD A NODE
     *
     * @param key
     * @param name
     */
    public void addNode(int key, String name) {

        // create and initialize new node
        Book newBook = new Book(key, name);

        // if this is the root, initialize it as new node
        if (root == null) {
            root = newBook;
        } else {
            // if it is not, create a new node
            // this is the root nod now
            Book focusBook = root;

            // set also the parent for the root
            Book parent;

            // check if the new node should go on left or right
            while (true) {
                parent = focusBook;
                // the left child has to have a value that is less of whatever the value the parent is
                if (key < focusBook.shelfPosition) {
                    focusBook = focusBook.leftBook;

                    // if the left child has no children, we want to place the new Book on the left of it
                    if (focusBook == null) {
                        parent.leftBook = newBook;
                        return;
                    }

                    // If we get here, we know we want to put the node on the right
                } else {
                    focusBook = focusBook.rightBook;

                    // if the left child has no children, we want to place the new Book on the left of it
                    if (focusBook == null) {
                        parent.rightBook = newBook;
                        return;
                    }
                }
            }
        }

    }

    /**
     * IN-ORDER TRAVERSAL
     *
     * @param focusBook
     */
    // The scope of this method is to produce results in increasing order
    // Start from the focus node, working your way up to the left-child node
    // when that hits a null, print out the current node, then jump back to the parent, then move to the right child
    // until a null is hit again
    public void inOrderTraverseTree(Book focusBook) {
        if (focusBook != null) {
            inOrderTraverseTree(focusBook.leftBook);

            System.out.println(focusBook);

            inOrderTraverseTree(focusBook.rightBook);
        }
    }

    /**
     * PRE-ORDER TRAVERSAL
     *
     * @param focusBook
     */
    // Start form the focus node (root or focus node)
    // Cycle down through all of the left children until hit a null
    // Then jump up ONE parent, and move to the right child
    // Jump back up into root
    // Cycle down through all of the right children until hit a null
    public void preorderTraversalTree(Book focusBook) {
        if (focusBook != null) {

            System.out.println(focusBook);

            preorderTraversalTree(focusBook.leftBook);
            preorderTraversalTree(focusBook.rightBook);


        }
    }

    /**
     * POST-ORDER TRAVERSAL
     * @param focusBook
     */
    // Start traversing through the left children
    // Move to the relative-right children
    // Move back up ONE parent
    // Jump to the absolute-right children
    // Work your way up
    // Arrive to root

    public void postOrderTraversalTree(Book focusBook) {
        if (focusBook != null) {

            postOrderTraversalTree(focusBook.leftBook);
            postOrderTraversalTree(focusBook.rightBook);

            System.out.println(focusBook);


        }
    }

    /**
     * FIND A NODE
     */

    public Book findNode(int key){

        Book focusBook = root;

        while (focusBook.shelfPosition != key){

            if (key < focusBook.shelfPosition){

                focusBook = focusBook.leftBook;

            } else {

                focusBook = focusBook.rightBook;
            }
            if (focusBook == null){
                return null;
            }
        }
        return focusBook;
    }

    /**
     * REMOVE A NODE
     * @param key
     * @return
     *
     * Basic walk through for the method:
     *
     * A - delete the root node
     *
     * Is X root?
     * The replacement for X is Y
     * Assign X left-child to Y
     *
     * B - delete a child
     *
     * Is Z < X ?
     * U will replace Z
     * root.leftBook = U
     * U.leftBook = V
     *
     */
    /**
     * Given this tree structure:
     *
     *           50
     *           /\
     *          25 75
     *          /\   \
     *        15  30  85
     *        /\
     *       2  18
     *
     */

    // The method is a boolean because first, we need to establish if a value CAN be deleted
    // from our tree or not
    public boolean remove(int input) {

        Book focusBook = root; // the node you are positioned in. At the beginning is equal to root.
        Book parent = root; // the parent node. At the beginning is equal to root.

        // This is important to understand which way to look for, left or right?
        // If the focus node has a left-child, go to the left
        // If it doesn't have a left child, go to the right
        boolean isItALeftBook = true;

        // While the focus is not equal to the value I am looking for, keep searching
        // focusBook.value = the data value of the focus node
        // This is coming from the class Book
        // Key is the value you want to remove
        while (focusBook.shelfPosition != input) {
            parent = focusBook;

            // Decide if to search to the left
            // If the child is smaller than the root, then we now it's a left-child
            // set the boolean to true
            // swap the focusBook to the left child
            if (input < focusBook.shelfPosition) {
                isItALeftBook = true;
                focusBook = focusBook.leftBook; // -> swapped the root with 25

            } else {

                // If it's not a left child, set it false
                // set the focusBook to whatever the focusBook right child was
                // this is going to move us to the right
                isItALeftBook = false;
                focusBook = focusBook.rightBook; // -> swapped the root with 75
            }

            // If we get here, the node was never found
            if (focusBook == null) {
                return false;
            }
        }

        // If the node does not have any children
        // and focusBook is the root
        // declare it null (which is essentially like deleting it)
        if (focusBook.leftBook == null && focusBook.rightBook == null) {

            if (focusBook == root) {
                root = null; // deleted a leaf

                // If the node was marked as a left child of the parent
                // then delete it from its parent
            } else if (isItALeftBook) {
                parent.leftBook = null;

            } else {

                // if it's not a left child, it must be a right one
                // so delete the right child from its parent
                parent.rightBook = null;
            }

            // Let's handle the situation when there is no right-child
        } else if (focusBook.rightBook == null)

            // If there is not right child
            // set root as focusBook's left child
            if (focusBook == root) {
                root = focusBook.leftBook;

                // If there is a left child
                // make the parent left-child the focus node left child
            } else if (isItALeftBook) {
                parent.leftBook = focusBook.leftBook;

            } else {
                // set the parent right child equals to the focus node left child
                parent.rightBook = focusBook.leftBook;

                // Let's handle the situation when there is no left-child
            } else if (focusBook.leftBook == null) {

            // If the focus node is the root
            // then replace it with the root's right child
            if (focusBook == root) {
                root = focusBook.rightBook;

                // else, if the focus node has a left child
                // the parent left child ot the focus node right child
            } else if (isItALeftBook) {
                parent.leftBook = focusBook.rightBook;

            } else {

                // viceversa
                parent.rightBook = focusBook.rightBook;
            }

            // When two children are involved, it's a bit more complicated
            // we need to figure out which one is the suited replacement
        } else {

            Book replacement = getReplacementNode(focusBook);

            // if the focusBook is the root
            // replace it with whatever is sent back from getReplacementNode();
            if (focusBook == root){
                root = replacement;
                // If it is a left child
                // the parent's left child needs to be equal whatever the replacement is
            } else if (isItALeftBook){
                parent.leftBook = replacement;
                // prent right-child will be equal to replacement
            } else {
                parent.rightBook = replacement;

                // the replacement has a left child
                // then we need to set it to whatever the focus node left child is
                replacement.leftBook = focusBook.leftBook;
            }
        }

        return true;

    }

    /**
     * REPLACE A NODE
     * @param toBeReplacedBook
     * @return
     */

    public Book getReplacementNode(Book toBeReplacedBook){

        Book replacementParent = toBeReplacedBook;
        Book replacement = toBeReplacedBook;

        Book focusBook = toBeReplacedBook.rightBook;

        while (focusBook != null){

            replacementParent = replacement;
            replacement = focusBook;

            focusBook = focusBook.leftBook;
        }

        if (replacement != toBeReplacedBook.rightBook){

            replacementParent.leftBook = replacement.rightBook;
            replacement.rightBook = toBeReplacedBook.rightBook;
        }

        return replacement;

    }
}
