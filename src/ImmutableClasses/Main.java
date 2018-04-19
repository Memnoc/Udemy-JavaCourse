package ImmutableClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,LocationImmutable> locations = new HashMap<>();
    private static int loc = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new LocationImmutable(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new LocationImmutable(1, "You are standing at the end of the road before a small brick building",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new LocationImmutable(2, "You are at the top of a hill",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new LocationImmutable(3, "You are inside a building, a well house for a small spring",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new LocationImmutable(4, "You are in a valley beside a stream",tempExit));


        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new LocationImmutable(5, "You are in the forest",tempExit));


        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word: words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }


            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else if (! exits.containsKey(direction)) {
                System.out.println("You have typed a wrong direction. \nCurrent location is: " + locations.get(loc).getDescription());
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}

