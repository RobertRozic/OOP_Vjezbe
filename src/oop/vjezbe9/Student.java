package oop.vjezbe9;

public class Student {

    private String ime;
    private String indeks;
    private int bodovi;

    public Student(String ime, String indeks, int bodovi) {
        this.ime = ime;
        this.indeks = indeks;
        this.bodovi = bodovi;
    }

    public String getIme() {
        return ime;
    }

    public String getIndeks() {
        return indeks;
    }

    public int getBodovi() {
        return bodovi;
    }

    @Override
    public String toString() {
        return indeks + " - " + ime + " (" + bodovi + " bodova)";
    }
}
