package org.example.factories;

import org.example.entities.Weapon;

public class WeaponFactory {
    public Weapon createWeapon(String name, String description, int cost, int damage) {
        Weapon weapon = new Weapon(name, description, 1, 100);
        weapon.setDamage(damage);
        return weapon;
    }
}
