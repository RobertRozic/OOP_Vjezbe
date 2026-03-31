package oop.vjezbe3;

import oop.models.Macka;
import oop.models.Pas;
import oop.models.Zivotinja;

public class TestZivotinje {
    public static void main(String[] args) {
        Zivotinja z1 = new Pas();
        Zivotinja z2 = new Macka();
        Zivotinja z3 = new Zivotinja();

        z1.glasajSe();
        z2.glasajSe();
        z3.glasajSe();

        String poruka = "Objektno orijentirano programiranje";
    }
}
