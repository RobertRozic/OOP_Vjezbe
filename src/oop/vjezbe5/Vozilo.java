package oop.vjezbe5;

public class Vozilo {
    private String registracija;
    protected int brojSati;
    public static int brojacVozila = 0;

    public Vozilo(String registracija, int brojSati) {
        this.registracija = registracija;
        this.brojSati = brojSati;
        brojacVozila++;
    }

    public double izracunajCijenu() {
        return brojSati * 1.5;
    }

    public String getTip() {
        return "Vozilo";
    }

    public final String getRegistracija() {
        return registracija;
    }

    public static int getBrojacVozila() {
        return brojacVozila;
    }
}
