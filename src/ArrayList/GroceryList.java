package ArrayList;

// It's a resizable array, that's it :)
// It handles the resizing automatically without you having to write code for it
// The ArrayList can hold objects
// Differently from the normal array, that wants a data-type definition, such as:
// int[], String[], double[], etc.
// The arrayList can hold objects <> such as ArrayList<String>
// This is due to the fact that ArrayList is actually a class, so it can have its own constructor:
//  private ArrayList<String> groceryList = new ArrayList<>( );

// Normally, you defined element in an Array like:
// int[] myArr = new int[50]; This is an empty array of 50 elements
// Then you initialize the indexes of the arrays as such:
// myArr[5] = 4; Meaning that the 5th element of the array will have value 5
// With the ListArray you don't have to do that, as it's all automatic.
// The only thing you need to do is to call a built-in method to it to add the values
// myArr.add();

import java.util.ArrayList;

public class GroceryList {
    //private int[] myNumbers;// Notice the difference from below
    private ArrayList<String> groceryList = new ArrayList<>();

    // add element to the ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    // Output all the items of the ArrayList
    // groceryList.size(); will return the exact number of elements in the array
    // groceryList.get(); will access the elements
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }


    // Replace the item in the ArrayList
    // groceryList.set() will replace the position and the new item
    // (position+1) is to avoid the output starting from 0
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // Removes an item
    // groceryList.get() will get the element
    // groceryList.remove the element got from the previous method
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // Find an element in the ArrayList:
    // groceryList.contains() is the powerful method used to automatically search items
    // groceryList.indexOf(); instead searches throughout the array, and returns the index position
    // of the searched element when found.
    // This introduces the possibility of performing a check on the index via an if-statement
    // The IF reads as follows: if the item found is greater or equal to 0, then return the position
    // of that item, otherwise return null;
    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

}
