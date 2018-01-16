package com.cfarrend.AusTravelSim;

public class Player {

    int currentLocation;

    // Other data like money, status, etc

    public Player() {

    }

    public void moveTo(int id) {
        // TODO: Some sort of checking to stop player from jumping around map??
        this.currentLocation = id;
    }
}
