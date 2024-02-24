package org.example.maps;

import org.example.entities.Store;
import org.example.entities.Weapon;
import org.example.gameObjects.*;

public class townOfBeginningsMap {

    Room x04y22 = new Room();
    Room x04y21 = new Room();
    Room x04y20 = new Room();
    Room x04y19 = new Room();
    Room x04y18 = new Room();
    Room x04y17 = new Room();
    Room x05y17 = new Room();
    Room x06y17 = new Room();
    Room x07y17 = new Room();
    Room x08y17 = new Room();
    Room x09y17 = new Room();
    Room x10y17 = new Room();
    Room x11y17 = new Room();
    Room x12y17 = new Room();
    Room x13y17 = new Room();
    Room x06y18 = new Room();
    Room x09y18 = new Room();
    Room x11y18 = new Room();
    Room x13y18 = new Room();
    Room x13y19 = new Room();
    Room x13y20 = new Room();
    Room x13y21 = new Room();
    Room x13y22 = new Room();
    Room x05y22 = new Room();
    Room x06y22 = new Room();
    Room x07y22 = new Room();
    Room x08y22 = new Room();
    Room x09y22 = new Room();
    Room x10y22 = new Room();
    Room x11y22 = new Room();
    Room x12y22 = new Room();
    Room x05y21 = new Room();
    Room x11y21 = new Room();
    Room x08y23 = new Room();

    private Room StartingRoom = x04y22;

    Store mapShop = new Store();
    Store weaponShop = new Store();

    public townOfBeginningsMap() {
        initializeRooms();
        this.setStartingRoom(x04y22);
    }

    public Room getStartingRoom() {
        return StartingRoom;
    }

    public void setStartingRoom(Room startingRoom) {
        StartingRoom = x04y22;
    }

    private void initializeRooms() {
        weaponShop.addWeaponToInventory("Damaged Sword", "A rusty sword that has seen better days.", 5, 10);
        weaponShop.addWeaponToInventory("Rusty Dagger", "A small, rusty dagger.", 3, 5);
        weaponShop.addWeaponToInventory("Wooden Staff", "A simple wooden staff.", 4, 7);
        weaponShop.addWeaponToInventory("Training Bow", "A simple bow for training.", 5, 8);


        x04y22.setName("Western entrance of the town of beginnings");
        x04y22.setDescription("""
                                
                The town is bustling with people and the sound of the blacksmith's hammer can be heard in the distance.
                To the east is the main street with shops lining both sides.
                To the west is the road that leads to the nearby forest.
                North and south the street continues along the city wall.
                """);
        x04y22.setNorth(x04y21);
        x04y22.setEast(x05y22);

        x04y21.setName("Along the city wall.");
        x04y21.setDescription("""
                                
                The wall continues to the north.
                To the east is the side of a building
                and to the south is the western gate of the town.
                """);
        x04y21.setSouth(x04y22);
        x04y21.setNorth(x04y20);

        x04y20.setName("Along the city wall.");
        x04y20.setDescription("""
                                
                To the far north you can see where the northern and western
                parts of the city wall meet.
                To the east is the side of a building
                and further to the south you can see the city gate.
                """);
        x04y20.setSouth(x04y21);
        x04y20.setNorth(x04y19);

        x04y19.setName("Along the city wall.");
        x04y19.setDescription("""
                                
                Up ahead you can see where the northern and western parts of the city wall meet.
                To the east is the side of a building
                and far to the south you can see the city gate.\s""");
        x04y19.setSouth(x04y20);
        x04y19.setNorth(x04y18);

        x04y18.setName("Along the city wall.");
        x04y18.setDescription("""
                                
                Just north you can see where the northern and western
                parts of the city wall meet.
                To the east is the side of the map shop
                and the wall continues to the south.\s""");
        x04y18.setSouth(x04y19);
        x04y18.setNorth(x04y17);

        x04y17.setName("North-western corner of the town.");
        x04y17.setDescription("""
                                
                The road continues to the east and south.
                """);
        x04y17.setSouth(x04y18);
        x04y17.setEast(x05y17);

        x05y17.setName("Along the northern city wall.");
        x05y17.setDescription("""
                                
                To the west is the north-western corner of the town.
                To the east a bustling street follows the wall with shops and houses along the south side.
                """);
        x05y17.setWest(x04y17);
        x05y17.setEast(x06y17);

        x06y17.setName("Along the northern city wall.");
        x06y17.setDescription("""
                                
                To the west is the north-western corner of the town.
                """);
        x06y17.setWest(x05y17);
        x06y17.setEast(x07y17);
        x06y17.setSouth(x06y18);

        x07y17.setName("Along the northern city wall.");
        x07y17.setDescription("""
                                
                To the south you can see a shop that sells maps.
                """);
        x07y17.setWest(x06y17);
        x07y17.setEast(x08y17);

        x08y17.setName("Along the northern city wall.");
        x08y17.setDescription("""
                                
                People are walking past you, going about their business.
                """);
        x08y17.setWest(x07y17);
        x08y17.setEast(x09y17);

        x09y17.setName("Along the northern city wall.");
        x09y17.setDescription("""
                                
                A large house is to the south.
                """);
        x09y17.setWest(x08y17);
        x09y17.setEast(x10y17);
        x09y17.setSouth(x09y18);

        x10y17.setName("Along the northern city wall.");
        x10y17.setDescription("""
                                
                You can smell the food cooking in the nearby homes
                """);
        x10y17.setWest(x09y17);
        x10y17.setEast(x11y17);

        x11y17.setName("Along the northern city wall.");
        x11y17.setDescription("""
                                
                Directly to the south there's a house with children playing outside.
                """);
        x11y17.setWest(x10y17);
        x11y17.setEast(x12y17);
        x11y17.setSouth(x11y18);

        x12y17.setName("Along the northern city wall.");
        x12y17.setDescription("""
                                
                Citizens are walking past you, going about their business.
                """);
        x12y17.setWest(x11y17);
        x12y17.setEast(x13y17);

        x13y17.setName("North-eastern corner of the town.");
        x13y17.setDescription("""
                                
                The road continues to the west and south.
                """);
        x13y17.setWest(x12y17);


        x06y18.setName("Map Shop");
        x06y18.setDescription("""
                There are various maps of the town and surrounding areas on display.
                The shopkeeper greets you as you enter.
                """);
        x06y18.setNorth(x06y17);
        x06y18.setStore(mapShop);


        x09y18.setName("Merchant's House");
        x09y18.setDescription("""
                .
                It's cozy and well-kept.
                The residents greet you warmly.
                """);
        x09y18.setNorth(x09y17);


        x11y18.setName("Noble's House");
        x11y18.setDescription("""
                                
                It's spacious and well-furnished.
                The residents seem friendly.
                """);
        x11y18.setNorth(x11y17);

        x13y18.setName("Near the north-east corner of town");
        x13y18.setDescription("""
                To the north the road turns west along the city wall.
                To the south the road continues along the eastern city wall.
                """);
        x13y18.setNorth(x13y17);
        x13y18.setSouth(x13y19);

        x13y19.setName("Along the eastern city wall.");
        x13y19.setDescription("""
                You can see where the eastern and northern parts of the city wall meet to the north.
                To the south the road continues along the eastern city wall.""");
        x13y19.setNorth(x13y18);
        x13y19.setSouth(x13y20);

        x13y20.setName("Along the eastern city wall.");
        x13y20.setDescription("""
                To the north and south the road continues along the eastern city wall.
                """);
        x13y20.setNorth(x13y19);
        x13y20.setSouth(x13y21);

        x13y21.setName("North of the eastern gate");
        x13y21.setDescription("""
                To the north the road continues along the eastern city wall.
                Just to the south you can see the bustling town gate.
                """);
        x13y21.setNorth(x13y20);
        x13y21.setSouth(x13y22);

        x13y22.setName("Eastern city gate");
        x13y22.setDescription("""
                You're at the eastern gate of the town.
                The road continues in all directions.
                East the roads leads to a landscape of farmland and forests.
                South and north the road continues along the city wall.
                West is the main road through town.
                """);
        x13y22.setNorth(x13y21);
        x13y22.setWest(x12y22);

        x05y22.setName("Along the main street.");
        x05y22.setDescription("""
                You're walking along the bustling main street.
                Citizens and adventurers are walking past you.
                Shops and stalls line both sides of the street.
                """);
        x05y22.setEast(x06y22);

        x06y22.setName("Along the main street.");
        x06y22.setDescription("""
                You're walking along the bustling main street.
                Directly to the north you can see the weapon shop.
                """);
        x06y22.setWest(x05y22);
        x06y22.setEast(x07y22);

        x07y22.setName("Along the main street.");
        x07y22.setDescription("""
                You're walking along the bustling main street.
                Citizens and adventurers are walking past you.
                Shops and stalls line both sides of the street.
                """);
        x07y22.setWest(x06y22);
        x07y22.setEast(x08y22);

        x08y22.setName("Along the main street.");
        x08y22.setDescription("""
                You're walking along the bustling main street.
                Directly to the south you can see the grocer.
                """);
        x08y22.setWest(x07y22);
        x08y22.setEast(x09y22);

        x09y22.setName("Along the main street.");
        x09y22.setDescription("""
                You're walking along the bustling main street.
                Citizens and adventurers are walking past you.
                Shops and stalls line both sides of the street.
                """);
        x09y22.setWest(x08y22);
        x09y22.setEast(x10y22);

        x10y22.setName("Along the main street.");
        x10y22.setDescription("""
                You're walking along the bustling main street.
                Citizens and adventurers are walking past you.
                Shops and stalls line both sides of the street.
                """);
        x10y22.setWest(x09y22);
        x10y22.setEast(x11y22);

        x11y22.setName("Along the main street.");
        x11y22.setDescription("""
                You're walking along the bustling main street.
                Directly to the north you can see the armor shop.
                """);
        x11y22.setWest(x10y22);
        x11y22.setEast(x12y22);

        x12y22.setName("Along the main street.");
        x12y22.setDescription("""
                You're walking along the bustling main street.
                Citizens and adventurers are walking past you.
                Shops and stalls line both sides of the street.
                To the east is one of the city gates.
                """);
        x12y22.setWest(x11y22);
        x12y22.setEast(x13y22);

        x05y21.setName("Weapon shop. \"The Gleaming Blade\".");
        x05y21.setDescription("You're inside the weapon shop.");
        x05y21.setSouth(x05y22);
        x05y21.setStore(weaponShop);

        x11y21.setName("Armor shop. \"The Iron Shield\".");
        x11y21.setDescription("You're inside the armor shop.");
        x11y21.setSouth(x11y22);

        x08y23.setName("Grocer");
        x08y23.setDescription("You're inside the grocer.");
        x08y23.setNorth(x08y22);

    }

}



