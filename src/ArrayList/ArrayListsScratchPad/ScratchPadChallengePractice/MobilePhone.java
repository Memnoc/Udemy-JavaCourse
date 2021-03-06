package ArrayList.ArrayListsScratchPad.ScratchPadChallengePractice;


import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContact;

    public MobilePhone() {
        this.myContact = myContact;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) <0) {
            System.out.println("The contact already exists");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition <0){
            System.out.println(oldContact.getName() + " does not exists");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists! Update was not successful");
            return false;
        }
        this.myContact.set(foundPosition, newContact);
        System.out.println("Old contact " + oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }




    private int findContact(Contact contact) {
        return myContact.indexOf(contact);
    }

    private int findContact (String contactName) {
        for (int i = 0; i <myContact.size() ; i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contact contact) {
        if (findContact(contact) >=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >=0) {
            return this.myContact.get(position);
        }
        return null;
    }


    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " does not exists");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName() + " has been removed!");
        return true;

    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i <myContact.size(); i++) {
            System.out.println((i+1) + "." +
            this.myContact.get(i).getName() + " -> " +
            this.myContact.get(i).getPhoneNumber());
        }
    }






}
