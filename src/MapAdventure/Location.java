package MapAdventure;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    // ability to add an exits

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    /*
    // IMPORTANT: instead of just returning the exits map
    // I am creating a new HashMap and passing out exits in the constructor
    // this creates a new map that has all the mappings from the exits map
    // The reason why this is a useful technique is that nothing outside eof the class
    // can change exits, so the getter returns a copy of the exits so if the calling program
    // wants to add or remove mappings from it then the exits mapping field will not ber affected.
     */

    public Map<String,Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
