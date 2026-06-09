package oop.vjezbe10;

import java.io.File;


public class PrimjerFile {
    public static void main(String[] args) {
        File datoteka1 = new File("podaci.txt");
        File datoteka2 = new File("data", "studenti.txt");
        File direktorij = new File("data");

        System.out.println("Postoji: " + datoteka1.exists());
        System.out.println("Je datoteka: " + datoteka1.isFile());
        System.out.println("Je direktorij: " + direktorij.isDirectory());
        System.out.println("Separator: " + File.separator);
    }
}

