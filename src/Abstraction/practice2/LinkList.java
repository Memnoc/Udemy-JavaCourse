package Abstraction.practice2;

public class LinkList {

    public Link firstLink;

    LinkList() {
        firstLink = null;
    }
    // check if the link is null
    public boolean isEmpty() {
        return (firstLink == null);

    }

    // insert a new link into the LinkedList
    // A new Link is created
    // Its Next is assigned the reference to the previous Link created
    // The LinkedList's firstLink is assigned a reference to the newest Link added

    // prepend method
    public void insertFirstLink (String bookName, int millionsSold) {

        Link newLink = new Link(bookName, millionsSold); // creating new Link
        newLink.next = firstLink; // create the head
        firstLink = newLink; // link the head to the next element
    }

    public Link removeFirst() {
        Link linkReference = firstLink; // linkReference -> pointer - firstLink -> head
        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkedList");
        }
        return linkReference;
    }

    public void display() {
        Link theLink = firstLink;

        while (theLink != null) {
            theLink.display();

            System.out.println("Next link: " + theLink.next);

            theLink = theLink.next;

            System.out.println();
        }
    }

    public Link find(String bookName) {

        Link theLink = firstLink;

        if(!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkedList");
        }
        return theLink;
    }

    public Link removeLink(String bookName) {

        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (currentLink.bookName != bookName) {
            if (currentLink.next == null){
                return null;
            } else {
                previousLink = currentLink;

                currentLink = currentLink.next;
            }
        }

        if (currentLink == firstLink) {

            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }


}
