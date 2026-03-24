package oop.models;

import oop.interfaces.Vozilo;

public class Automobil implements Vozilo {
    @Override
    public void pokreni() {
        System.out.println("Automobil pokrenut");
    }

    @Override
    public void zaustavi() {
        System.out.println("Automobil zaustavljen");
    }
}
