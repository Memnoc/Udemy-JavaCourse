package ArrayList.challenge;

// Master class
// store, modify, remove and query contact names

import java.util.ArrayList;

public class MobilePhone {

    public ArrayList<String> contactList = new ArrayList<>();

    public void addContacts(String item) {
        contactList.add(item);

    }

    public void removeContact(int position) {
        contactList.remove( position );

    }

    public void modifyContacts(String name, int number) {

    }

    public void searchContacts(String name, int number) {

    }
}
