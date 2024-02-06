package org.example.factories;

import org.example.entities.Armor;

public class ArmorFactory {
    public Armor createArmor(String name, String description, int armorValue) {
        Armor armor = new Armor(name, description);
        armor.setArmorValue(armorValue);
        return armor;
    }
}