package org.example.maps;

import org.example.gameObjects.*;

public class townOfBeginningsMap {

    Room x4y22 = new Room();
    Room x4y21 = new Room();
    Room x4y20 = new Room();
    Room x4y19 = new Room();
    Room x4y18 = new Room();
    Room x4y17 = new Room();
    Room x5y17 = new Room();
    Room x6y17 = new Room();
    Room x7y17 = new Room();
    Room x8y17 = new Room();
    Room x9y17 = new Room();
    Room x10y17 = new Room();
    Room x11y17 = new Room();
    Room x12y17 = new Room();
    Room x13y17 = new Room();
    Room x6y18 = new Room();
    Room x9y18 = new Room();
    Room x11y18 = new Room();

    private Room StartingRoom = x4y22;

    public townOfBeginningsMap() {
        initializeRooms();
        this.setStartingRoom(x4y22);
    }

    public Room getStartingRoom() {
        return StartingRoom;
    }

    public void setStartingRoom(Room startingRoom) {
        StartingRoom = x4y22;
    }

    private void initializeRooms() {

        x4y22.setName("Western entrance of the town of beginnings");
        x4y22.setDescription("""
                                
                The town is bustling with people and the sound of the blacksmith's hammer can be heard in the distance.
                To the east is the main street with shops lining both sides.
                To the west is the road that leads to the nearby forest.
                North and south the street continues along the city wall.
                """);
        x4y22.setNorth(x4y21);

        x4y21.setName("Along the city wall.");
        x4y21.setDescription("""
                                
                The wall continues to the north.
                To the east is the side of a building
                and to the south is the western gate of the town.
                """);
        x4y21.setSouth(x4y22);
        x4y21.setNorth(x4y20);

        x4y20.setName("Along the city wall.");
        x4y20.setDescription("""
                                
                To the far north you can see where the northern and western
                parts of the city wall meet.
                To the east is the side of a building
                and further to the south you can see the city gate.
                """);
        x4y20.setSouth(x4y21);
        x4y20.setNorth(x4y19);

        x4y19.setName("Along the city wall.");
        x4y19.setDescription("""
                                
                Up ahead you can see where the northern and western parts of the city wall meet.
                To the east is the side of a building
                and far to the south you can see the city gate.\s""");
        x4y19.setSouth(x4y20);
        x4y19.setNorth(x4y18);

        x4y18.setName("Along the city wall.");
        x4y18.setDescription("""
                                
                Just north you can see where the northern and western
                parts of the city wall meet.
                To the east is the side of the map shop
                and the wall continues to the south.\s""");
        x4y18.setSouth(x4y19);
        x4y18.setNorth(x4y17);

        x4y17.setName("North-western corner of the town.");
        x4y17.setDescription("""
                                
                The road continues to the east and south.
                """);
        x4y17.setSouth(x4y18);
        x4y17.setEast(x5y17);

        x5y17.setName("Along the northern city wall.");
        x5y17.setDescription("""
                                
                To the west is the north-western corner of the town.
                To the east a bustling street follows the wall with shops and houses along the south side.
                """);
        x5y17.setWest(x4y17);
        x5y17.setEast(x6y17);

        x6y17.setName("Along the northern city wall.");
        x6y17.setDescription("""
                                
                To the west is the north-western corner of the town.
                """);
        x6y17.setWest(x5y17);
        x6y17.setEast(x7y17);
        x6y17.setSouth(x6y18);

        x7y17.setName("Along the northern city wall.");
        x7y17.setDescription("""
                                
                To the south you can see a shop that sells maps.
                """);
        x7y17.setWest(x6y17);
        x7y17.setEast(x8y17);

        x8y17.setName("Along the northern city wall.");
        x8y17.setDescription("""
                                
                People are walking past you, going about their business.
                """);
        x8y17.setWest(x7y17);
        x8y17.setEast(x9y17);

        x9y17.setName("Along the northern city wall.");
        x9y17.setDescription("""
                                
                A large house is to the south.
                """);
        x9y17.setWest(x8y17);
        x9y17.setEast(x10y17);
        x9y17.setSouth(x9y18);

        x10y17.setName("Along the northern city wall.");
        x10y17.setDescription("""
                                
                You can smell the food cooking in the nearby homes
                """);
        x10y17.setWest(x9y17);
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


        x6y18.setName("Map Shop");
        x6y18.setDescription("""
                There are various maps of the town and surrounding areas on display.
                The shopkeeper greets you as you enter.
                """);
        x6y18.setNorth(x6y17);


        x9y18.setName("Merchant's House");
        x9y18.setDescription("""
                .
                It's cozy and well-kept.
                The residents greet you warmly.
                """);
        x9y18.setNorth(x9y17);


        x11y18.setName("Noble's House");
        x11y18.setDescription("""
                
                It's spacious and well-furnished.
                The residents seem friendly.
                """);
        x11y18.setNorth(x11y17);

    }

}



