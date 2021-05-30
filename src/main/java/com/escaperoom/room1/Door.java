package com.escaperoom.room1;

public class Door {
    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public String openDoor(Player player) {
        if (player.getKey().isAvailable()) {
            isOpen = true;
            return "Drzwi otwarte!";
        } else {
            return "Coś jest nie tak drzwi ani drgną";
        }
    }
}
