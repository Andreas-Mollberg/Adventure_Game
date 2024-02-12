package org.example.gameLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInput {
public static void Start() throws IOException {
        BufferedReader reader;
        String input;
        String output;

        reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("> ");
            input = reader.readLine();
            output = runCommand(input);
            System.out.println(output);

        } while (!input.equals("q"));
    }

    public static String runCommand(String input) {
        List<String> wl;
        String affirmative = "ok";
        String lowerCaseInput = input.trim().toLowerCase();

        if (!lowerCaseInput.equals("q")) {
            if (lowerCaseInput.equals("")) {
                affirmative = "You must enter a command";
            } else {
                wl = wordList(lowerCaseInput);
                parseCommand(wl);
            }
        }
        return affirmative;
    }

    public static List<String> wordList(String input) {
        String delims = "[ \t,.:;?!\"']+";
        List<String> stringList = new ArrayList<>();
        String[] words = input.split(delims);

        for (String word : words) {
            stringList.add(word);
        }
        return stringList;
    }

    public static void parseCommand(List<String> wordList) {
        String action = wordList.get(0);
        String object = wordList.get(1);

        List<String> actions = new ArrayList<>(Arrays.asList("take", "drop", "list", "equip", "unequip", "look"));
        List<String> objects = new ArrayList<>(Arrays.asList("ring", "sword", "shield"));

        if (wordList.size() != 2) {
            System.out.println("Only 2 word commands are allowed");
        } else {
            action = wordList.get(0);
            object = wordList.get(1);
            if (!actions.contains(action)) {
                System.out.println(action + " is not a known action");
            }
            if (!objects.contains(object)) {
                System.out.println(object + " is not a known object");
            }
        }
    }
}
