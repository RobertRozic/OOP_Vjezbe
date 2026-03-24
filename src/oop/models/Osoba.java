package oop.models;

public class Osoba {
    protected String ime;
    protected String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void ispisi() {
        System.out.println(ime + " " + prezime);
    }
}

