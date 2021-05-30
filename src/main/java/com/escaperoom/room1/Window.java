package com.escaperoom.room1;

import lombok.Getter;

@Getter
public class Window {
    boolean open;

    public Window() {
        this.open = false;
    }

    public String openOrClose() {
        if (open) {
            open = false;
            return "Zamknięto okno";
        } else {
            open = true;
            return "Otwarto Okno";
        }
    }
}
