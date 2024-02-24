package org.example.gameObjects;

public class Item {
    public static final int WEAPON_SLOT = 1;
    public static final int ARMOR_SLOT = 2;

    private String name;
    private String description;
    private int slot;
    private int cost;

    public Item(String name, int slot, int cost) {
        if (name == null || slot < 1 || slot > 2) {
            throw new IllegalArgumentException("Name cannot be null and slot must be 1 or 2");
        }
        this.name = name;
        this.slot = slot;
        this.cost = cost;
    }

    public Item(String name, String description, int slot, int cost) {
        if (name == null || description == null || slot < 1 || slot > 2) {
            throw new IllegalArgumentException("Name, description cannot be null and slot must be 1 or 2");
        }
        this.name = name;
        this.description = description;
        this.slot = slot;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSlotName() {
        switch (this.slot) {
            case WEAPON_SLOT:
                return "Weapon";
            case ARMOR_SLOT:
                return "Armor";
            default:
                return "Unknown";
        }
    }
}
