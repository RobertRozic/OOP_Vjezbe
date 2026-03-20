package oop.vjezbe2;

import oop.models.Tocka;

public class TestTocka {
    public static void main(String[] args) {
        Tocka t1 = new Tocka();
        Tocka t2 = new Tocka(3, 4);

        System.out.println("t1 = (" + t1.dajX() + ", " + t1.dajY() + ")");
        System.out.println("t2 = (" + t2.dajX() + ", " + t2.dajY() + ")");
        System.out.println("Udaljenost t1 do t2 = " + t1.udaljenost(t2));
    }
}