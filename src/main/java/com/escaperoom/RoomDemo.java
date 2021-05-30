package com.escaperoom;

public class RoomDemo {
    //Zaprojektuj program, w którym użytkownik będzie znajdował się w pokoju. Będą znajdować się w nim drzwi, okno i klucz.
    //Użytkownik będzie wykonać interakcje z jednym z wybranych przedmiotów (użyj narzędzia Scanner).
    //Gra kończy się gdy uda mu się otworzyć drzwi.
    //
    //Jeśli użytkownik użyje:
    //okno: - otworzy się lub zamknie
    //klucz: - użytkownik zabierze klucz i klucz nie będzie się już pojawiał jako jedna z opcji
    //drzwi: - otworzą się ale tylko jeśli użytkownik zabrał klucz, jeśli nie, pozostaną zamknięte
    //
    //Program ma być gotowy na dodanie nowych pomieszczeń i nowych rodzajów rzeczy zarówno możliwych do użycia jak i do zabrania.
    //Przy każdej próbie użycia obiektu powinnien wyświetlić się stosowny komunikat.
    //
    //Wskazane jest rozdzielić komunikację z graczem od serwisu odpowiedzialnego za resztę rozgrywki

    public static void main(String[] args) {
        ConsoleGame.start();
    }
}
