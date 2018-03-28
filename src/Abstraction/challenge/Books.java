package Abstraction.challenge;

public class Books extends ListBooks {
    Books head;

    public Books(int data) {
        super(data);
    }

    @Override
    void append(int data) {
        if (head == null) {
            head = new Books(data);
            return;
        }
        Books current = head;
        while (current.next != null) {
            current = (Books)current.next;
        }
        current.next = new Books(data);
    }

    @Override
    ListBooks compareBooksTitle(String title) {
        return null;
    }



    public void prepend(int data) {
        Books newHead = new Books(data);
        newHead.next = head;
        head = newHead;
        System.out.println(head.toString());
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = (Books)head.next;
            return;
        }

        Books current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = (Books)current.next;
        }
    }
}
