package com.cfarrend.AusTravelSim;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class World {

    static final int SPAWN_ID = 0;

    String mapName;
    int numberOfLocations;

    int nextLocationId = 0;
    int nextRoadId = 0;

    Map<Integer, Location> locations = new HashMap<>();

    Location playerLocation;

    // TODO: Constructor argument links to data file to build map
    public World() {

    }

    private int getNextLocationId() {
        return nextLocationId++;
    }

    private int getNextRoadId() {
        return nextRoadId++;
    }

    public Location getLocationAt(int id) {
        if (locations.containsKey(id)) {
            return locations.get(id);
        }   else {
            return null;
        }
    }

    public void buildMap() {
        // TODO: Read from file to do a similar thing
        // TODO: Location add function to add to map and append location ID
        Location l1 = new Location("Tamworth", getNextLocationId(), State.NSW, 41006, -31.0927, 150.9320);
        Location l2 = new Location("Armidale", getNextLocationId(), State.NSW,23352, -30.5016, 151.6662);

        // TODO: Where should this function be located?
        //Road.connectOneWayRoad("New England Highway", Direction.DIR_NE, getNextRoadId(), 3, 3, 2, l1, l2);
        Road.connectTwoWayRoad("New England Highway [A15]", Direction.DIR_NE, getNextRoadId(), getNextRoadId(), 3, 3, 2, l1, l2);

        // TODO: Temp for now, quick and dirty map adding
        locations.put(l1.getId(), l1);
        locations.put(l2.getId(), l2);

        //l1.printLocationInfo();
        //l2.printLocationInfo();

    }

    public int spawnPlayer() {
        return SPAWN_ID;
    }

    // TODO: Decide on moving functions (i.e from Location, from World, what about Player class? lots of questions)
    public boolean movePlayer(Direction dir) {
        return true;
    }

}
