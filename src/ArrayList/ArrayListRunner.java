package ArrayList;

import java.util.Scanner;

public class ArrayListRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item to the list.");
        System.out.println("\t 4 - To remove an item to the list.");
        System.out.println("\t 5 - To search an item to the list.");
        System.out.println("\t 6 - To quit the application.");

    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // Part 2:
    // Instead of asking for a number here, we want to ask what is the current
    // grocery item that we want to modify

    public static void modifyItem(){
        System.out.print("Current item name: ");
        //int itemNo = scanner.nextInt();
        String itemNo = scanner.nextLine(); // old item number
        //scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine(); // new item number
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name: ");
        //int itemNo = scanner.nextInt();
        String itemNo  =scanner.nextLine();
        //scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    //Part 2:
    // changing groceryList.findItem(searchItem) != null)
    // to (groceryList.onFile(searchItem))
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not int the shopping list");
        }
    }


}
