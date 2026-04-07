package oop.vjezbe5;

public class Motocikl extends Vozilo {
    public Motocikl(String registracija, int brojSati) {
        super(registracija, brojSati);
    }

    @Override
    public double izracunajCijenu() {
        if (brojSati <= 3) {
            return brojSati * 1.0;
        } else {
            return brojSati * 0.8;
        }
    }

    @Override
    public String getTip() {
        return "Motocikl";
    }
}
