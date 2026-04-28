package oop.vjezbe7;

public class Ulaznica {
    private String oznaka;
    private String nazivFilma;
    protected int brojKarata;
    private static int brojRezervacija = 0;

    public Ulaznica(String oznaka, String nazivFilma, int brojKarata) {
        this.oznaka = oznaka;
        this.nazivFilma = nazivFilma;
        this.brojKarata = brojKarata;
        brojRezervacija++;
    }

    public double izracunajCijenu() {
        return brojKarata * 6.0;
    }

    public String getTip() {
        return "Standardna ulaznica";
    }

    final public String getOznaka() {
        return oznaka;
    }

    public static int getBrojRezervacija() {
        return brojRezervacija;
    }

    public int getBrojKarata() {
        return brojKarata;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }
}
