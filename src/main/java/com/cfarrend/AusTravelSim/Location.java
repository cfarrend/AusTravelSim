package com.cfarrend.AusTravelSim;

import java.util.HashMap;
import java.util.Map;

public class Location {

    // Metadata
    String name;
    int id;
    int population;
    double latitude;
    double longitude;

    // Data objects
    Map<Direction, Road> outgoingRoads = new HashMap<>();
    Map<Direction, Road> incomingRoads = new HashMap<>();

    public Location(String name, int id, int population, double latitude, double longitude) {
        this.name = name;
        this.id = id;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public boolean addOutgoingRoad(Road road) {
        return true;
    }


}
