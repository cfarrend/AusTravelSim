package com.cfarrend.AusTravelSim;

public class Game {

    Player player;
    World gameWorld;

    // TODO: Forgot this stuff was supposed to be in World shieet
    int nextLocationId = 0;
    int nextRoadId = 0;

    public Game() {
        this.player = new Player();
        this.gameWorld = new World();
        constructMap();
    }

    private void constructMap() {
        // TODO: Read from file to do a similar thing
        Location l1 = new Location("Tamworth", getNextLocationId(), 41006, -31.0927, 150.9320);
        Location l2 = new Location("Armidale", getNextLocationId(), 23352, -30.5016, 151.6662);

        // TODO: Where should this function be located?
        // connectOneRoad(l1, l2, Direction.DIR_NW, "New England Highway", getNextRoadId(), 3, 3, 2);

    }

    private int getNextLocationId() {
        return nextLocationId++;
    }

    private int getNextRoadId() {
        return nextRoadId++;
    }
}
