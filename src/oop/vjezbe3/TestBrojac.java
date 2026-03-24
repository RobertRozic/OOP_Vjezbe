package oop.vjezbe3;

import oop.models.Brojac;
import oop.models.Matematika;

public class TestBrojac {
    public static void main(String[] args) {
        new Brojac();
        new Brojac();
        new Brojac();

        System.out.println("Broj objekata: " + Brojac.broj);

        int rezultat = Matematika.kvadrat(5);

        System.out.println("Kvadrat od 5 je: " + rezultat);
    }
}
