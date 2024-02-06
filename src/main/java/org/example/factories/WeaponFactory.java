package org.example.factories;

import org.example.entities.Weapon;

public class WeaponFactory {
    public Weapon createWeapon(String name, String description, int damage) {
        Weapon weapon = new Weapon(name, description);
        weapon.setDamage(damage);
        return weapon;
    }
}
