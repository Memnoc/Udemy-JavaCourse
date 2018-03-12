package ArrayList.challenge;

// Master class
// store, modify, remove and query contact names
// holds the array
// check if a contact exists

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<String> contactList = new ArrayList<>();

    public ArrayList<String> getContactList() {
        return contactList;
    }

    // print list
    public void printContacts(){
        System.out.println("You have " + contactList.size() + " contacts in your list");
        for (int i = 0; i <contactList.size() ; i++) {
            System.out.println((i+1) + ". " + contactList.get(i));
        }
    }

    // add
    public void addNewContact(String item){
        contactList.add(item);
    }

    // remove overload

    public void removeContact(String item) {
        int position = searchContact(item);
        if (position >= 0) {
            removeContact(position);
        }
    }

    // remove
    public void removeContact(int position){
        String theItem = contactList.get(position);
        contactList.remove(position);
    }

    // modify overload

    public void editContact(String currentItem, String newItem){
        int position = searchContact(currentItem);
        if (position >= 0){
            editContact(position, newItem);
        }
    }

    // modify
    public void editContact(int position, String contact){
        String theItem = contactList.get(position);
        contactList.set(position, contact);
    }

    // search
    public int searchContact (String searchContact){
        return contactList.indexOf(searchContact);
    }

    // check if exists
    public boolean contactExists(String contact){
        int position = searchContact(contact);
        if (position >=0){
            return true;
        } else {
            return false;
        }
    }


}
