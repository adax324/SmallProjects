package com.escaperoom;


import com.escaperoom.room1.Player;
import com.escaperoom.room1.Room1;
import com.utils.Parser;

public class ConsoleGame {
    public static void start() {
        while (true) {
            menu1();
        }


    }

    private static void menu1() {
        System.out.println("Witaj w grze escape room\nWybierz pokój\n0.Wyjście\n" +
                "1.Level I");

        switch (Parser.scannerParserStringToInt()) {
            case 1:
                level1();
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    private static void level1() {
        boolean escaped = false;
        Room1 room1 = new Room1(new Player());
        while (!escaped) {
            System.out.println("1.Otwórz drzwi");
            System.out.println(room1.getWindow().isOpen() ? "2.Zamknij okno" : "2.Otwórz okno");

            if (room1.getKey().isAvailable()) {
                System.out.println("3.Podnieś klucz");
            }
            switch (Parser.scannerParserStringToInt()) {
                case 1:
                    if (room1.getPlayer().getKey().isAvailable()) {
                        System.out.println("Drzwi otwarte");
                        escaped = true;
                    } else {
                        System.out.println("Coś nie tak");
                    }
                    break;
                case 2:
                    System.out.println(room1.getWindow().openOrClose());
                    break;
                case 3:
                    if (!room1.getPlayer().getKey().isAvailable())
                        System.out.println(room1.takeKey());
                    break;


            }
        }
        System.out.println("Wygrałeś!!! Brawo kozaku");
    }
}
