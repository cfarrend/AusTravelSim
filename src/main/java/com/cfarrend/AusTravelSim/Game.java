package com.cfarrend.AusTravelSim;

public class Game {

    Player player;
    World gameWorld;

    public Game() {
        this.player = new Player();
        this.gameWorld = new World();
        gameWorld.buildMap();
        player.updateLocation(gameWorld.spawnPlayer());
        System.out.println("You are currently located in " + gameWorld.getLocationAt(player.getCurrentLocationId()).getName());
        System.out.println("\nYou can drive to the following locations:");
        String[] locations = gameWorld.getLocationAt(player.getCurrentLocationId()).getOutgoingRoads();
        if (locations.length <= 0) {
            System.out.println("No locations to drive to");
        }   else {
            for (int i = 0; i < locations.length; i++) {
                System.out.println(locations[i]);
            }
        }
        //gameWorld.getPlayerLocation().printLocationInfo();
    }
}
