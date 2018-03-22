package Interfaces.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Players matt = new Players("Matteo", 10, 15);
        Monsters lestat = new Monsters("Lestat", "Ancient Vampire", "Medianic Powers", 789, 1000);
        System.out.println(matt.toString());
        System.out.println(lestat.toString());
        savedObject(matt);
        savedObject(lestat);

        matt.setHitPoints(8);
        System.out.println(matt);
        matt.setWeapon("StormBringer");
        savedObject(matt);
        loadObject(matt);
        System.out.println(matt);

        lestat.setStrength(689);
        System.out.println(lestat);
        lestat.setPower("Fire");
        savedObject(lestat);
        loadObject(lestat);
        System.out.println(lestat);




    }

    public static ArrayList<String> readValues () {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject (ISaveable objectToSave) {
        for (int i = 0; i <objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }

    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
