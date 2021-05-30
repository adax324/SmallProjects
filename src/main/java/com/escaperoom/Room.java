package com.escaperoom;

import com.escaperoom.room1.Door;
import com.escaperoom.room1.Key;
import com.escaperoom.room1.Player;
import com.escaperoom.room1.Window;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Room {
    private Door door;
    private Window window;
    private Key key;
    private Player player;

    public Room(Player player) {
        this.door = new Door();
        this.window = new Window();
        this.key = new Key();
        this.player = player;
    }

    public void setKeyUnavailable() {
        key.setAvailable(false);
    }


}
