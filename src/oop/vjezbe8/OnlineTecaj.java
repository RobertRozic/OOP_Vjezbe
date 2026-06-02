package oop.vjezbe8;

public class OnlineTecaj implements Plativo {
    private String naziv;
    private double cijena;

    public OnlineTecaj(String naziv, double cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    @Override
    public double izracunajCijenu() {
        return cijena;
    }

    @Override
    public double izracunajPorez() {
        return izracunajCijenu() * 0.17;
    }

    public String getNaziv() {
        return naziv;
    }
}
