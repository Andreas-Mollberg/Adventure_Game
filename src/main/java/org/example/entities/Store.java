package org.example.entities;

import org.example.factories.ArmorFactory;
import org.example.factories.WeaponFactory;
import org.example.gameObjects.Item;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_DARK_GREY = "\u001B[90m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    private List<Item> inventory;
    private WeaponFactory weaponFactory;
    private ArmorFactory armorFactory;

    public Store() {
        inventory = new ArrayList<>();
        weaponFactory = new WeaponFactory();
        armorFactory = new ArmorFactory();
    }

    public void addWeaponToInventory(String name, String description, int cost, int damage) {
        Weapon weapon = weaponFactory.createWeapon(name, description, cost, damage);
        inventory.add(weapon);
    }

    public void addArmorToInventory(String name, String description, int armorValue) {
        Armor armor = armorFactory.createArmor(name, description, armorValue);
        inventory.add(armor);
    }

    public Item removeItem(String itemName) {
        Item toRemove = null;
        for (Item item : inventory) {
            if (item.getName().equals(itemName)) {
                toRemove = item;
                break;
            }
        }
        if (toRemove != null) {
            inventory.remove(toRemove);
        }
        return toRemove;
    }

    public void displayInventory() {
        System.out.println("Wares in stock:");
        if (inventory.isEmpty()) {
            System.out.println("There are currently no items in stock.");
        } else {
            System.out.printf(ANSI_DARK_GREY + "|" + ANSI_BRIGHT_YELLOW + "%-20s" + ANSI_DARK_GREY + "|" + ANSI_BRIGHT_BLUE + "%-15s" + ANSI_DARK_GREY + "|" + ANSI_RESET + "%n", "Item", "Price");
            for (Item item : inventory) {
                System.out.printf(ANSI_DARK_GREY + "|" + ANSI_BRIGHT_BLUE + "%-20s" + ANSI_DARK_GREY + "|" + ANSI_BRIGHT_YELLOW + "%-15d" + ANSI_DARK_GREY + "|" + ANSI_RESET + "%n", item.getName(), item.getCost());
            }
        }
    }

}