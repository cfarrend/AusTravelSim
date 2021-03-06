package com.cfarrend.AusTravelSim;

import java.util.HashMap;
import java.util.Map;

public class Location {

    // Metadata
    String name;
    int id;
    State state;
    int population;
    double latitude;
    double longitude;

    // Data objects
    Map<Direction, Road> outgoingRoads = new HashMap<>();
    Map<Direction, Road> incomingRoads = new HashMap<>();

    public Location(String name, int id, State state, int population, double latitude, double longitude) {
        this.name = name;
        this.id = id;
        this.state = state;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getStateAbbrev() {
        return this.state.getNameAbbrev();
    }

    public String getStateFull() {
        return this.state.getNameFull();
    }

    public Map<Direction, Road> getOutgoingRoads() {
        return this.outgoingRoads;
    }

    public String[] getOutgoingRoadsText() {

        String[] outgoing = new String[outgoingRoads.size()];

        int i = 0;
        for (Direction key : outgoingRoads.keySet()) {
            if (outgoingRoads.containsKey(key)) {
                Road road = outgoingRoads.get(key);
                outgoing[i] = road.getDirection().getName() + " to " + road.getFinish().getName() + " (" + road.getFinish().getStateAbbrev() + ") - via " + road.getName();
            }
            i++;
        }

        return outgoing;
    }

    public void printLocationInfo() {
        System.out.println("****** " + this.name + " (Location) ******");
        System.out.println("Id: " + this.id);
        System.out.println("Population: " + this.population);
        System.out.println("Latitude: " + this.latitude);
        System.out.println("Longitude: " + this.longitude);
        System.out.println("--- Outgoing Roads ---");
        for (Direction key : outgoingRoads.keySet()) {
            if (outgoingRoads.containsKey(key)) {
                Road road = outgoingRoads.get(key);
                System.out.println("Name: " + road.getName());
                System.out.println("Desination: " + road.getFinish().getName());
                System.out.println("Direction: " + road.getDirection().getName());
                System.out.println("Length: " + road.getLength() + "km");
            }
        }
        System.out.println("--- Incoming Roads ---");
        for (Direction key : incomingRoads.keySet()) {
            if (incomingRoads.containsKey(key)) {
                Road road = incomingRoads.get(key);
                System.out.println("Name: " + road.getName());
                System.out.println("Origin: " + road.getStart().getName());
                System.out.println("Direction: " + road.getDirection().getOpposite().getName());
            }
        }

    }

    public boolean addOutgoingRoad(Road road) {
        outgoingRoads.put(road.getDirection(), road);
        return true;
    }

    public boolean addIncomingRoad(Road road) {
        incomingRoads.put(road.getDirection().getOpposite(), road);
        return true;
    }


}
