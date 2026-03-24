package oop.vjezbe3;

import oop.interfaces.Vozilo;
import oop.models.Automobil;

public class TestVozilo {
    public static void main(String[] args) {
        Vozilo v1 = new Automobil();
        v1.pokreni();
        v1.zaustavi();
    }
}
