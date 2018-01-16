package com.cfarrend.AusTravelSim;

public class Player {

    int currentLocationId;

    // Other data like money, status, etc

    public Player() {

    }

    public int getCurrentLocationId() {
        return this.currentLocationId;
    }

    public void updateLocation(int id) {
        this.currentLocationId = id;
    }
}
