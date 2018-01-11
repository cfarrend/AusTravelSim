package com.cfarrend.AusTravelSim;

public enum Direction {
    DIR_N, DIR_NE, DIR_E, DIR_SE, DIR_S, DIR_SW, DIR_W, DIR_NW;

    public static String printDirection(Direction dirs) {
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
    }

}
