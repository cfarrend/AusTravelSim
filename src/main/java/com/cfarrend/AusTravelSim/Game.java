package com.cfarrend.AusTravelSim;

public class Game {

    Player player;
    World gameWorld;
    boolean active;

    public Game() {
        this.active = true;
        this.player = new Player();
        this.gameWorld = new World();
        gameWorld.buildMap();
        player.updateLocation(gameWorld.spawnPlayer());
    }

    public boolean isActive() {
        return active;
    }

    public void close() {
        active = false;
    }

    //TODO: Change this to return values to avoid console related issues
    public void printStatus() {
        System.out.println("\nYou are currently located in " + gameWorld.getLocationAt(player.getCurrentLocationId()).getName());
        System.out.println("You can drive to the following locations:");
        String[] locations = gameWorld.getLocationAt(player.getCurrentLocationId()).getOutgoingRoadsText();
        if (locations.length <= 0) {
            System.out.println("No locations to drive to");
        }   else {
            for (int i = 0; i < locations.length; i++) {
                System.out.println(locations[i]);
            }
        }
    }

    public void printTownInfo() {
        gameWorld.getLocationAt(player.getCurrentLocationId()).printLocationInfo();
    }

    public boolean move(Direction dir) {
        if (dir == null) {
            return false;
        }   else {
            player.updateLocation(gameWorld.moveDir(player.getCurrentLocationId(), dir));
            return true;
        }
    }
}
