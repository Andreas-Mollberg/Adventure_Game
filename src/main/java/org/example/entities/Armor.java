package org.example.entities;

import org.example.gameObjects.Item;

public class Armor extends Item {
    private int armorValue;

    public Armor(String name) {
        super(name, ARMOR_SLOT);
    }

    public Armor(String name, String description) {
        super(name, description, ARMOR_SLOT);
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }
}
