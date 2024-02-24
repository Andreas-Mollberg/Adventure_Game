package org.example.main;

import org.example.entities.Player;
import org.example.maps.townOfBeginningsMap;
import org.example.gameObjects.Room;

public class CommandHandler {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private Player player;
    private townOfBeginningsMap map;

    public CommandHandler(Player player, townOfBeginningsMap map) {
        this.player = player;
        this.map = map;
    }

    public void handleInput(String input) {
        if (input.equals("n") || input.equals("s") || input.equals("e") || input.equals("w")) {
            handleDirectionInput(input);
            System.out.println("You are currently in " + player.getCurrentRoom().getName());
            System.out.println(player.getCurrentRoom().getDescription());
            System.out.println(player.getCurrentRoom().getAvailableExits());
        } else {
            handleActionInput(input);
        }
    }

    private void handleActionInput(String action) {
        switch (action) {
            case "l":
            case "look":
                System.out.println(player.getCurrentRoom().getDescription());
                System.out.println(player.getCurrentRoom().getAvailableExits());
                break;
            case "eq":
            case "equipment":
                player.displayEquippedItems();
                break;
            case "i":
            case "inventory":
                player.displayInventory();
                break;
            case "list":
                if (player.getCurrentRoom().getStore() != null) {
                    System.out.println("You are in the store.");
                    player.getCurrentRoom().getStore().displayInventory();
                } else {
                    System.out.println("There is no store in this room.");
                }
                break;
            default:
                System.out.println(ANSI_RED + "Invalid input." + ANSI_RESET);
                break;
        }
    }

    private void handleDirectionInput(String direction) {
        Room nextRoom = null;
        direction = direction.trim().toLowerCase();

        switch (direction) {
            case "n":
            case "north":
                nextRoom = player.getCurrentRoom().getNorth();
                break;
            case "s":
            case "south":
                nextRoom = player.getCurrentRoom().getSouth();
                break;
            case "e":
            case "east":
                nextRoom = player.getCurrentRoom().getEast();
                break;
            case "w":
            case "west":
                nextRoom = player.getCurrentRoom().getWest();
                break;
            default:
                System.out.println(ANSI_RED + "Invalid direction." + ANSI_RESET + " Please enter " + ANSI_YELLOW + "n" +
                        ANSI_RESET + "orth," + ANSI_YELLOW + "s" + ANSI_RESET + "outh," + ANSI_YELLOW + "e" +
                        ANSI_RESET + "ast," + "or " + ANSI_YELLOW + "w" + ANSI_RESET + "est.");
                return;
        }

        if (nextRoom == null) {
            System.out.println(ANSI_RED + "You can't go that way." + ANSI_RESET);
        } else {
            player.setCurrentRoom(nextRoom);
        }
    }
}