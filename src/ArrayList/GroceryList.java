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
        groceryList.add( item );

    }

    // Output all the items of the ArrayList
    // groceryList.size(); will return the exact number of elements in the array
    // groceryList.get(); will access the elements
    public void printGroceryList() {
        System.out.println( "You have " + groceryList.size() + " items in your grocery list" );
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println( (i + 1) + ". " + groceryList.get( i ) );
        }
    }


    // Part 2:
    // Overloading the method modifyGroceryItem(int position, String newItem)
    // We are trying to find a number with findItem( newItem );
    // If the number is >= 0, then we have an element, and we pass it to
    // the original method findItem( newItem );
    // That will do the set and communicate the item has been modified
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem( currentItem );
        if (position >= 0) {
            modifyGroceryItem( position, newItem );
        }

    }


    // Replace the item in the ArrayList
    // groceryList.set() will replace the position and the new item
    // (position+1) is to avoid the output starting from 0
    // Part 2:
    // changing to private to force the use of the overloaded method externally
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set( position, newItem );
        System.out.println( "Grocery item " + (position + 1) + " has been modified" );
    }

    // Part 2:
    // Same as the above
    public void removeGroceryItem(String item) {
        int position = findItem( item );
        if (position >= 0) {
            removeGroceryItem( position );
        }
    }

    // Removes an item
    // groceryList.get() will get the element
    // groceryList.remove the element got from the previous method
    // Part 2:
    // changing to private to force the use of the overloaded method externally
    // Commenting out String theItem = groceryList.get( position );
    // As we are testing that already in th overloaded method
    private void removeGroceryItem(int position) {
        //String theItem = groceryList.get( position );
        groceryList.remove( position );
    }

    // Find an element in the ArrayList: (part1)
    // groceryList.contains() is the powerful method used to automatically search items
    // groceryList.indexOf(); instead searches throughout the array, and returns the index position
    // of the searched element when found.
    // This introduces the possibility of performing a check on the index via an if-statement
    // The IF reads as follows: if the item found is greater or equal to 0, then return the position
    // of that item, otherwise return null;

    // Find an element in the ArrayList: (part2)
    // We have commented out the original code in the method in favour of the current one
    // Th reason is that we want to find out which index position a particular string in the
    // array is, so we can avoid delegating that to the ArrayListRunner
    // ** Right now, the client (aka the program using the class) is deciding and finding positions of the elements
    // This is bad practice. The good way to do this is to let the class handle this.
    // This is why we need to return the index position in this method so we can use it later on
    // by passing it to modifyGroceryItem(int position, String newItem)
    // Switching access to private as we want this method to be internal

    private int findItem(String searchItem) {
        return groceryList.indexOf( searchItem );
        //boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0){
//            return groceryList.get(position);
//        }
//        return null;

    }

    // We need to a method to enable someone to actually pass a grocery item
    // and to check whether the item exists

    public boolean onFile(String searchItem) {
        int position = findItem( searchItem );
        if (position >=0){
            return true;
        }
        return false;
    }

}
