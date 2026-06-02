package oop.vjezbe8;

import oop.vjezbe7.PremijernaUlaznica;
import oop.vjezbe7.StudentskaUlaznica;
import oop.vjezbe7.Ulaznica;
import oop.vjezbe7.VIPUlaznica;

public class Vjezbe8 {
    public static void main(String[] args) {
        Lik lik1 = new Prvokutnik(3, 5);
        //OnlineTecaj o1 = new OnlineTecaj();

        //System.out.println("Cijena je " + o1.izracunajCijenu());

        Lik[] likovi = new Lik[2];

        likovi[0] = new Prvokutnik(3,5);
        likovi[1] = new Trokut(5, 5);

        for (Lik lik : likovi) {
            lik.ispisiPodatke();
        }

        Plativo[] stavke = new Plativo[2];

        stavke[0] = new OnlineTecaj("Java OOP", 80);
        stavke[1] = new Knjiga("Uvod u OOP", 35, true);

        double ukupno = 0.0;

        for (Plativo p : stavke) {
            ukupno += p.izracunajCijenu() + p.izracunajPorez();
        }

        System.out.println("Ukupna cijena:" + ukupno);

    }
}
