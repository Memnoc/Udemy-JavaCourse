package Abstraction.practice2;

public class Main {

    public static void main(String[] args) {

        LinkList theLinkList = new LinkList();

        theLinkList.insertFirstLink("Don Quixote", 500);
        theLinkList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkList.insertFirstLink("The Lord Of The Rings", 900);
        theLinkList.insertFirstLink("Harry Potter", 800);

//        theLinkList.removeLink("Don Quixote");
        theLinkList.removeFirst();
        System.out.println(theLinkList.find("Don Quixote").bookName + " was found");
        theLinkList.removeLink("Don Quixote");

        theLinkList.display();


    }
}
