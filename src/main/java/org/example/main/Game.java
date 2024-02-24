package org.example.main;

import org.example.entities.Player;
import org.example.maps.townOfBeginningsMap;
import org.example.gameObjects.Room;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private BufferedReader reader;
    private Player player;
    private townOfBeginningsMap map;
    private CommandHandler commandHandler;

    public Game() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        player = new Player("Test Player");
        map = new townOfBeginningsMap();
        commandHandler = new CommandHandler(player, map);
    }

    public void initializeGame() {
        player.setCurrentRoom(map.getStartingRoom());
        System.out.println("Welcome to the game!");
        System.out.println("You are currently in " + player.getCurrentRoom().getName());
    }

    public void gameLoop() throws IOException {
        while (true) {
            String input = reader.readLine().toLowerCase();
            commandHandler.handleInput(input);
        }
    }
}