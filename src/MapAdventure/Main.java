package MapAdventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<>();
    private static int loc = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of the road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        // position 1
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);


        // position 2
        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        // position 3
        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        /// position 4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        // position 5
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);

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

            String[] split = scanner.nextLine().toUpperCase().split(" ", 2);
            String direction = split[0];

            for (String i : split) {
                switch (i) {
                    case "NORTH":
                        direction = "N";
                        break;
                    case "SOUTH":
                        direction = "S";
                        break;
                    case "EAST":
                        direction = "E";
                        break;
                    case "WEST":
                        direction = "W";
                        break;
                    case "END":
                        direction = "Q";
                        break;
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

        // https://stackoverflow.com/questions/33311779/ways-to-create-custom-commands-for-a-text-based-adventure-game

//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i : road) {
//            System.out.println(i);
//        }
//
//        System.out.println("==================================");
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for (String i : building) {
//            System.out.println(i);
//        }
    }
}


