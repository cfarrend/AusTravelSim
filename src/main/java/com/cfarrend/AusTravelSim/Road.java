package com.cfarrend.AusTravelSim;

import java.io.Serializable;

public class Road {

    // Metadata
    String name;
    Direction dir;
    int id;
    int complexity;
    int quality;
    int density;
    // TODO: Length

    // Data
    Location start;
    Location finish;

    private Road(String name, Direction dir, int id, Location start, Location finish) {
        this.name = name;
        this.dir = dir;
        this.id = id;
        this.start = start;
        this.finish = finish;
    }

    private Road(String name, Direction dir, int id, int complexity, int quality, int density, Location start, Location finish) {
        this.name = name;
        this.dir = dir;
        this.id = id;
        this.complexity = complexity;
        this.quality = quality;
        this.density = density;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return this.name;
    }

    public Direction getDirection() {
        return this.dir;
    }

    public int getId() {
        return  this.id;
    }

    public Location getStart() {
        return this.start;
    }

    public Location getFinish() {
        return this.finish;
    }

    // TODO: Just here to jog ideas
    public static boolean connectOneWayRoad(String name, Direction dir, int id, Location start, Location finish) {
        return true;
    }

    public static boolean connectOneWayRoad(String name, Direction dir, int id, int complexity, int quality, int density,
                                         Location start, Location finish) {
        Road road = new Road(name, dir, id, complexity, quality, density, start, finish);

        start.addOutgoingRoad(road);
        finish.addIncomingRoad(road);

        //road.printRoadInfo();

        return true;
    }

    public static boolean connectTwoWayRoad(String name, Direction dir, int id, Location start, Location finish) {
        return true;
    }

    public static boolean connectTwoWayRoad(String name, Direction dir, int startId, int finishId, int complexity, int quality, int density,
                                            Location start, Location finish) {
        Road fromStart = new Road(name, dir, startId, complexity, quality, density, start, finish);
        Road fromFinish = new Road(name, dir.getOpposite(), finishId, complexity, quality, density, finish, start);

        start.addOutgoingRoad(fromStart);
        finish.addIncomingRoad(fromStart);

        finish.addOutgoingRoad(fromFinish);
        start.addIncomingRoad(fromFinish);

        //road.printRoadInfo();

        return true;
    }

    public void printRoadInfo() {
        System.out.println("****** " + this.name + " (Road) ******");
        System.out.println("Direction: " + this.dir.getName());
        System.out.println("Id: " + this.id);
        System.out.println("Complexity: " + this.complexity);
        System.out.println("Quality: " + this.quality);
        System.out.println("Density: " + this.density);
        System.out.println("Start Location: " + this.start.getName());
        System.out.println("Finish Location: " + this.finish.getName());
    }
}
