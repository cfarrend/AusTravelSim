package com.cfarrend.AusTravelSim;

public enum Direction {
    DIR_N, DIR_NE, DIR_E, DIR_SE, DIR_S, DIR_SW, DIR_W, DIR_NW;

    private Direction opposite;
    private String name;

    static {
        DIR_N.opposite = DIR_S;
        DIR_NE.opposite = DIR_SW;
        DIR_E.opposite = DIR_W;
        DIR_SE.opposite = DIR_NW;
        DIR_S.opposite = DIR_N;
        DIR_SW.opposite = DIR_NE;
        DIR_W.opposite = DIR_E;
        DIR_NW.opposite = DIR_SE;
    }

    static {
        DIR_N.name = "North";
        DIR_NE.name = "North East";
        DIR_E.name = "East";
        DIR_SE.name = "South East";
        DIR_S.name = "South";
        DIR_SW.name = "South West";
        DIR_W.name = "West";
        DIR_NW.name = "North West";
    }

    /* Obsolete for now hopefully
    public String printDirection(Direction dirs) {
        switch (dirs) {
            case DIR_N:
                return "North";
            case DIR_NE:
                return "North East";
            case DIR_E:
                return "East";
            case DIR_SE:
                return "South East";
            case DIR_S:
                return "South";
            case DIR_SW:
                return "South West";
            case DIR_W:
                return "West";
            case DIR_NW:
                return "North West";
            default:
                return "Undefined";
        }
    }

    public static Direction oppositeDirection(Direction dirs) {
        switch (dirs) {
            case DIR_N:
                return DIR_S;
            case DIR_NE:
                return DIR_SW;
            case DIR_E:
                return DIR_W;
            case DIR_SE:
                return DIR_NW;
            case DIR_S:
                return DIR_N;
            case DIR_SW:
                return DIR_NE;
            case DIR_W:
                return DIR_E;
            case DIR_NW:
                return DIR_SE;
            default:
                return null;
        }
    } */

    public Direction getOpposite() {
        return opposite;
    }

    public String getName() {
        return name;
    }

    public static Direction parseDir(String input) {
        switch (input) {
            case "North":
            case "N":
                return DIR_N;
            case "North East":
            case "NE":
                return DIR_NE;
            case "East":
            case "E":
                return DIR_E;
            case "South East":
            case "SE":
                return DIR_SE;
            case "South":
            case "S":
                return DIR_S;
            case "South West":
            case "SW":
                return DIR_SW;
            case "West":
            case "W":
                return DIR_W;
            case "North West":
            case "NW":
                return DIR_NW;
        }

        return null;

    }

}
