package com.cfarrend.AusTravelSim;

public class Road {

    // Metadata
    String name;
    int id;
    int complexity;
    int quality;
    int density;

    // Data
    Location start;
    Location finish;

    private Road(String name, int id, Location start, Location finish) {
        this.name = name;
        this.id = id;
        this.start = start;
        this.finish = finish;
    }

    private Road(String name, int id, int complexity, int quality, int density, Location start, Location finish) {
        this.name = name;
        this.id = id;
        this.complexity = complexity;
        this.quality = quality;
        this.density = density;
        this.start = start;
        this.finish = finish;
    }

    // TODO: Just here to jog ideas
    public static boolean connectOneRoad(Location start, Location finish, String name, int id, int complexity,
                                         int quality, int density) {
        return true;
    }

    public static boolean connectOneRoad(Location start, Location finish, String name, int id) {
        return true;
    }
}
