package oop.models;

public class Student extends Osoba {
    private String brojIndeksa;

    public Student(String ime, String prezime, String brojIndeksa) {
        super(ime, prezime);
        this.brojIndeksa = brojIndeksa;
    }

    public void ispisiStudenta() {
        super.ispisi();
        System.out.println("Indeks: " + brojIndeksa);
    }

    @Override
    public void ispisi() {
        System.out.println("Student: " + ime + " " + prezime + " " + brojIndeksa);
    }
}
