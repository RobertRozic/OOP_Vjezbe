package oop.vjezbe9;

import java.util.ArrayList;
import java.util.List;

public class PrimjerListe {
    public static void main(String[] args) {
        List<String> studenti = new ArrayList<>();

        studenti.add("Ana");
        studenti.add("Marko");
        studenti.add("Ivan");
        studenti.add("Ana");

        System.out.println("Broj elemenata: " + studenti.size());
        System.out.println("Sadrzi Ivana: " + studenti.contains("Ivan"));

        for (String student : studenti) {
            System.out.println(student);
        }
    }
}