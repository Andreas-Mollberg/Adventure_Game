package org.example.entities;

import org.example.gameObjects.Item;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int slot, int cost, int damage) {
        super(name, slot, cost);
        this.damage = damage;
    }

    public Weapon(String name, String description, int damage, int cost) {
        super(name, description, damage, cost);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
