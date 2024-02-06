package org.example.gameObjects;

public class Room {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private String name, description;
    private Room north, south, east, west;

    public Room() {
    }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
        if (north != null && north.getSouth() != this) {
            north.setSouth(this);
        }
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
        if (south != null && south.getNorth() != this) {
            south.setNorth(this);
        }
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
        if (east != null && east.getWest() != this) {
            east.setWest(this);
        }
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
        if (west != null && west.getEast() != this) {
            west.setEast(this);
        }
    }

    public String getAvailableExits() {
        StringBuilder exits = new StringBuilder("Exits: ");
        if (getNorth() != null) {
            exits.append(ANSI_YELLOW + "n" + ANSI_RESET + "orth ");
        }
        if (getSouth() != null) {
            exits.append(ANSI_YELLOW + "s" + ANSI_RESET + "outh ");
        }
        if (getEast() != null) {
            exits.append(ANSI_YELLOW + "e" + ANSI_RESET + "ast ");
        }
        if (getWest() != null) {
            exits.append(ANSI_YELLOW + "w" + ANSI_RESET + "est ");
        }
        return exits.toString();
    }
}