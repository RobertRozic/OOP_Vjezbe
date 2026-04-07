package oop.vjezbe5;

public class Automobil extends Vozilo{
    private boolean elektricni = false;

    public Automobil(String registracija, int brojSati) {
        super(registracija, brojSati);
    }

    public Automobil(String registracija, int brojSati, boolean elektricni) {
        super(registracija, brojSati);
        this.elektricni = elektricni;
    }

    @Override
    public double izracunajCijenu() {
        if (elektricni) {
            return brojSati * 2.0 * 0.8;
        }

        return brojSati * 2.0;
    }

    @Override
    public String getTip() {
        return "Automobil";
    }
}
