package ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

public class LocationImmutable {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public LocationImmutable(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }

    // ability to add an exits

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }



    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }


    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
