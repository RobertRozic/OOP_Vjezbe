package oop.vjezbe3;

import oop.models.Osoba;
import oop.models.Student;

public class TestNasljedjivanje {
    public static void main(String[] args) {
        Student s = new Student("Ivan", "Marić", "IT-12345");
        s.ispisiStudenta();

        Osoba o = new Student("Ana", "Kovač", "IT-54321");
        o.ispisi();

        Osoba o1 = new Osoba("Robert", "Rozic");
        o1.ispisi();
    }
}
