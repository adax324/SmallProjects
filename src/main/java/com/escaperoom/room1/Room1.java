package com.escaperoom.room1;

import com.escaperoom.Room;

public class Room1 extends Room {

    public Room1(Player player) {
        super(player);
    }

    public String takeKey() {
        getKey().giveKey(getPlayer());
        setKey(new Key());
        setKeyUnavailable();
        return "Podniosleś klucz";
    }
}
