package Abstraction.myChallenge;

public interface IBook {

    void insertFirstElement(String title, int position);
    void insertLastElement(String title, int position);
    boolean isEmpty();
    boolean insertAfterNode(String title, int position, int key);
    void sortInOrder(String title, int position);
}
