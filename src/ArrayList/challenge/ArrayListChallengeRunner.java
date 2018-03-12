package ArrayList.challenge;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallengeRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To remove a contact in the list.");
        System.out.println("\t 4 - To modify a contact in the list.");
        System.out.println("\t 5 - To search a contact in the list.");
        System.out.println("\t 6 - To quit the application.");

    }

    public static void addItem(){
        System.out.println("Please enter name and phone-number: ");
        mobilePhone.addNewContact(scanner.nextLine());
    }

    public static void removeItem(){
        System.out.println("Enter the contact name you wish to remove: ");
        String itemNo  = scanner.nextLine();
        mobilePhone.removeContact(itemNo);
    }

    public static void modifyItem(){
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        mobilePhone.editContact(itemNo, newItem);
    }

    public static void searchItem(){
        System.out.println("Enter the contact to find: ");
        String searchItem = scanner.nextLine();
        if (mobilePhone.contactExists(searchItem)) {
            System.out.println("Found " + searchItem + " in your contact list");
        } else {
            System.out.println(searchItem + " is not in the contact list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(mobilePhone.getContactList());
    }
}
