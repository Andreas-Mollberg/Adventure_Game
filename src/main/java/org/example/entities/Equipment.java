package org.example.entities;

import org.example.gameObjects.Item;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private Item weapon;
    private Item armor;

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Item getArmor() {
        return armor;
    }

    public void setArmor(Item armor) {
        this.armor = armor;
    }

    public List<Item> getEquippedItems() {
        List<Item> equippedItems = new ArrayList<>();
        if (weapon != null) {
            equippedItems.add(weapon);
        }
        if (armor != null) {
            equippedItems.add(armor);
        }
        return equippedItems;
    }
}