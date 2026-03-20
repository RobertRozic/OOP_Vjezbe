package oop.models;

public class Student {
    private String ime;
    private String prezime;

    public Student() {
        ime = "Nepoznato";
        prezime = "Nepoznato";
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void ispisiPodatke() {
        System.out.println(ime + " " + prezime);
    }
}
