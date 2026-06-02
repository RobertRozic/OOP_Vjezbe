package oop.vjezbe8;

public class Knjiga implements Plativo {
    private String naziv;
    private double cijena;
    private boolean popust;

    public Knjiga(String naziv, double cijena, boolean popust) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.popust = popust;
    }

    @Override
    public double izracunajCijenu() {
        if (popust) {
            return cijena * 0.9;
        } else {
            return cijena;
        }
    }

    @Override
    public double izracunajPorez() {
        return izracunajCijenu() * 0.1;
    }
}
