// ArrayList come into place when it comes to have a resizable array

package ArrayList.ArrayListsScratchPad;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScratchPad {
    // When defining an ArrayList the data type is defined in between <>
    private static ArrayList<String> myList = new ArrayList<>();
    private ArrayList<Integer> myList2 = new ArrayList<>();
    private ArrayList<Double> myList3 = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }


    // Adding elements:

    // Because we do not need to specify the size of the Array, we add items into it
    // by calling a built.in method of the ArrayList class

    public void addItem(String item) {
        myList.add(item);

    }

    public void addItem2(int item) {
        myList2.add(item);
    }

    public void addItem3(double item) {
        myList3.add(item);
    }





    // Printing elements:

    // Again, we use a method and within it, rwo built-in methods
    // size(); and get()
    // Size get the length of the array
    // Get gets the index position, and in fact you need to pass the index variable to it
    // get(i);
    // You obviously need a for-loop to for through the results

    public void printList() {
        System.out.println("You have " + myList.size() + " items in your list");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i + 1) + ". " + myList.get(i));
        }
    }

    public void printList2() {
        System.out.println("You have " + myList2.size() + " items in your list");
        for (int i = 0; i < myList2.size(); i++) {
            System.out.println((i + 1) + ". " + myList2.get(i));
        }
    }

    public void printList3() {
        System.out.println("You have " + myList3.size() + " items in your list");
        for (int i = 0; i < myList3.size(); i++) {
            System.out.println((i + 1) + ". " + myList3.get(i));
        }
    }

    // Modifying elements:

    // Pretty much the same as the other methods, but this time using
    // the built in method set();

    public void modifyListItem(int position, String newItem) {
        myList.set(position, newItem);
        System.out.println("List item " + (position + 1) + " has been modified");
    }

    public void modifyListItem2(int position, int newInt) {
        myList2.set(position, newInt);
        System.out.println("List item " + (position + 1) + " has been modified");
    }

    public void modifyListItem3(int position, double newItem) {
        myList3.set(position, newItem);
        System.out.println("List item " + (position + 1) + " has been modified");
    }

    // Removing elements

    // Same story but using remove();
    // Here we are just using the get() method to actually output
    // which values has been removed

    public void removingListItem(int position, String item) {
        String theItem = myList.get(position);
        myList.remove(position);

    }

    // Find elements

    // This time we exploit the built in method contains()
    // via the use of a boolean

    public String findItem(String searchItem){
        boolean exists = myList.contains(searchItem);
        // Knowing that the item exists in the list is not enough
        // we want to return the index position of item we've found
        // we can do it via the method indexOf();
        // If the item is not present in the list, we'll get a -1
        int position = myList.indexOf(searchItem);
        // This allows us to perform a check, and return the item IF present
        if (position >= 0){
            return myList.get(position);
        }

        return null;
    }
}
