package com.escaperoom.room1;

public class Key {
    private boolean isAvailable = true;

    public String giveKey(Player player) {
        player.takeKey(this);
        return "Podniesiono klucz";
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
