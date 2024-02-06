package org.example.entities;

import org.example.gameObjects.Item;
import org.example.gameObjects.Room;

public class Player {
    private String name;
    private int hp;
    private Inventory inventory;
    private Equipment equipment;
    private Room currentRoom;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.inventory = new Inventory();
        this.equipment = new Equipment();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void equipItem(Item item) {
        if (inventory.getItems().contains(item)) {
            if (item.getSlot() == Item.WEAPON_SLOT) {
                equipment.setWeapon(item);
                System.out.println("Equipped weapon: " + item.getName());
            } else if (item.getSlot() == Item.ARMOR_SLOT) {
                equipment.setArmor(item);
                System.out.println("Equipped armor: " + item.getName());
            }
            inventory.removeItem(item);
        }
    }

    public void equipItemByName(String itemName) {
        for (Item item : inventory.getItems()) {
            if (item.getName().equals(itemName)) {
                equipItem(item);
                break;
            }
        }
    }

    public void unequipItem(Item item) {
        if (item.equals(equipment.getWeapon())) {
            inventory.addItem(item);
            equipment.setWeapon(null);
        } else if (item.equals(equipment.getArmor())) {
            inventory.addItem(item);
            equipment.setArmor(null);
        }
    }

    public void buyItem(Store store, String itemName) {
        Item item = store.removeItem(itemName);
        System.out.println("Bought item: " + (item != null ? item.getName() : "null"));
        if (item != null) {
            inventory.addItem(item);
        }
    }

    public void displayEquippedItems() {
        System.out.println("Displaying equipped items...");
        if (equipment.getEquippedItems().isEmpty()) {
            System.out.println("No items are equipped.");
        } else {
            System.out.println("Equipped items:");
            for (Item item : equipment.getEquippedItems()) {
                System.out.println("<" + item.getSlotName() + ">    " + item.getName());
            }
        }
    }

    }
