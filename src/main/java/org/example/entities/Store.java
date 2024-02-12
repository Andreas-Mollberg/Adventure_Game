package org.example.entities;

import org.example.factories.ArmorFactory;
import org.example.factories.WeaponFactory;
import org.example.gameObjects.Item;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> inventory;
    private WeaponFactory weaponFactory;
    private ArmorFactory armorFactory;

    public Store() {
        inventory = new ArrayList<>();
        weaponFactory = new WeaponFactory();
        armorFactory = new ArmorFactory();
    }

    public void addWeaponToInventory(String name, String description, int damage, int slot) {
        Weapon weapon = weaponFactory.createWeapon(name, description, damage);
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
            for (Item item : inventory) {
                System.out.println(item.getName() + " - " + item.getDescription());
            }
        }
    }


}