package org.example.entities;

import org.example.gameObjects.Item;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name) {
        super(name, WEAPON_SLOT);
    }

    public Weapon(String name, String description) {
        super(name, description, WEAPON_SLOT);
    }

    public Weapon(String name, String description, int slot, int damage) {
        super(name, description, slot);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
