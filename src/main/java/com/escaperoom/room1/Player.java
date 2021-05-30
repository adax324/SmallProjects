package com.escaperoom.room1;

public class Player {
    private Key key;

    public Player() {
        this.key = new Key();
        key.setAvailable(false);
    }

    public void takeKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }
}
