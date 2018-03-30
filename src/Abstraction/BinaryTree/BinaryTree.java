package Abstraction.BinaryTree;

public class BinaryTree {

    // every tree must have a root value
    Node root;

    /**
     * ADD A NODE
     *
     * @param key
     * @param name
     */
    public void addNode(int key, String name) {

        // create and initialize new node
        Node newNode = new Node(key, name);

        // if this is the root, initialize it as new node
        if (root == null) {
            root = newNode;
        } else {
            // if it is not, create a new node
            // this is the root nod now
            Node focusNode = root;

            // set also the parent for the root
            Node parent;

            // check if the new node should go on left or right
            while (true) {
                parent = focusNode;
                // the left child has to have a value that is less of whatever the value the parent is
                if (key < focusNode.value) {
                    focusNode = focusNode.leftChild;

                    // if the left child has no children, we want to place the new Node on the left of it
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }

                    // If we get here, we know we want to put the node on the right
                } else {
                    focusNode = focusNode.rightChild;

                    // if the left child has no children, we want to place the new Node on the left of it
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    /**
     * IN-ORDER TRAVERSAL
     *
     * @param focusNode
     */
    // The scope of this method is to produce results in increasing order
    // Start from the focus node, working your way up to the left-child node
    // when that hits a null, print out the current node, then jump back to the parent, then move to the right child
    // until a null is hit again
    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    /**
     * PRE-ORDER TRAVERSAL
     *
     * @param focusNode
     */
    // Start form the focus node (root or focus node)
    // Cycle down through all of the left children until hit a null
    // Then jump up ONE parent, and move to the right child
    // Jump back up into root
    // Cycle down through all of the right children until hit a null
    public void preorderTraversalTree(Node focusNode) {
        if (focusNode != null) {

            System.out.println(focusNode);

            preorderTraversalTree(focusNode.leftChild);
            preorderTraversalTree(focusNode.rightChild);


        }
    }

    /**
     * POST-ORDER TRAVERSAL
     * @param focusNode
     */
    // Start traversing through the left children
    // Move to the relative-right children
    // Move back up ONE parent
    // Jump to the absolute-right children
    // Work your way up
    // Arrive to root

    public void postOrderTraversalTree(Node focusNode) {
        if (focusNode != null) {

            postOrderTraversalTree(focusNode.leftChild);
            postOrderTraversalTree(focusNode.rightChild);

            System.out.println(focusNode);


        }
    }

    /**
     * FIND A NODE
     */

    public Node findNode(int key){

        Node focusNode = root;

        while (focusNode.value != key){

            if (key < focusNode.value){

                focusNode = focusNode.leftChild;

            } else {

                focusNode = focusNode.rightChild;
            }
            if (focusNode == null){
                return null;
            }
        }
        return focusNode;
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
     * root.leftChild = U
     * U.leftChild = V
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

        Node focusNode = root; // the node you are positioned in. At the beginning is equal to root.
        Node parent = root; // the parent node. At the beginning is equal to root.

        // This is important to understand which way to look for, left or right?
        // If the focus node has a left-child, go to the left
        // If it doesn't have a left child, go to the right
        boolean isItALeftChild = true;

        // While the focus is not equal to the value I am looking for, keep searching
        // focusNode.value = the data value of the focus node
        // This is coming from the class Node
        // Key is the value you want to remove
        while (focusNode.value != input) {
            parent = focusNode;

            // Decide if to search to the left
            // If the child is smaller than the root, then we now it's a left-child
            // set the boolean to true
            // swap the focusNode to the left child
            if (input < focusNode.value) {
                isItALeftChild = true;
                focusNode = focusNode.leftChild; // -> swapped the root with 25

            } else {

                // If it's not a left child, set it false
                // set the focusNode to whatever the focusNode right child was
                // this is going to move us to the right
                isItALeftChild = false;
                focusNode = focusNode.rightChild; // -> swapped the root with 75
            }

            // If we get here, the node was never found
            if (focusNode == null) {
                return false;
            }
        }

        // If the node does not have any children
        // and focusNode is the root
        // declare it null (which is essentially like deleting it)
        if (focusNode.leftChild == null && focusNode.rightChild == null) {

            if (focusNode == root) {
                root = null; // deleted a leaf

                // If the node was marked as a left child of the parent
                // then delete it from its parent
            } else if (isItALeftChild) {
                parent.leftChild = null;

            } else {

                // if it's not a left child, it must be a right one
                // so delete the right child from its parent
                parent.rightChild = null;
            }

            // Let's handle the situation when there is no right-child
        } else if (focusNode.rightChild == null)

            // If there is not right child
            // set root as focusNode's left child
            if (focusNode == root) {
            root = focusNode.leftChild;

            // If there is a left child
                // make the parent left-child the focus node left child
            } else if (isItALeftChild) {
            parent.leftChild = focusNode.leftChild;

        } else {
            // set the parent right child equals to the focus node left child
            parent.rightChild = focusNode.leftChild;

            // Let's handle the situation when there is no left-child
        } else if (focusNode.leftChild == null) {

            // If the focus node is the root
            // then replace it with the root's right child
            if (focusNode == root) {
                root = focusNode.rightChild;

                // else, if the focus node has a left child
                // the parent left child ot the focus node right child
            } else if (isItALeftChild) {
                parent.leftChild = focusNode.rightChild;

            } else {

                // viceversa
                parent.rightChild = focusNode.rightChild;
            }

            // When two children are involved, it's a bit more complicated
            // we need to figure out which one is the suited replacement
        } else {

            Node replacement = getReplacementNode(focusNode);

            // if the focusNode is the root
            // replace it with whatever is sent back from getReplacementNode();
            if (focusNode == root){
                root = replacement;
                // If it is a left child
                // the parent's left child needs to be equal whatever the replacement is
            } else if (isItALeftChild){
                parent.leftChild = replacement;
                // prent right-child will be equal to replacement
            } else {
                parent.rightChild = replacement;

                // the replacement has a left child
                // then we need to set it to whatever the focus node left child is
                replacement.leftChild = focusNode.leftChild;
            }
        }

        return true;

        }

    /**
     * REPLACE A NODE
     * @param toBeReplacedNode
     * @return
     */

    public Node getReplacementNode(Node toBeReplacedNode){

            Node replacementParent = toBeReplacedNode;
            Node replacement = toBeReplacedNode;

            Node focusNode = toBeReplacedNode.rightChild;

            while (focusNode != null){

                replacementParent = replacement;
                replacement = focusNode;

                focusNode = focusNode.leftChild;
            }

            if (replacement != toBeReplacedNode.rightChild){

                replacementParent.leftChild = replacement.rightChild;
                replacement.rightChild = toBeReplacedNode.rightChild;
            }

            return replacement;

        }



    }

