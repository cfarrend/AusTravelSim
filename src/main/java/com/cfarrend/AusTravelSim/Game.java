package com.cfarrend.AusTravelSim;

public class Game {

    Player player;
    World gameWorld;

    public Game() {
        this.player = new Player();
        this.gameWorld = new World();
        gameWorld.buildMap();
        player.moveTo(gameWorld.spawnPlayer());
        //gameWorld.getPlayerLocation().printLocationInfo();
    }
}
