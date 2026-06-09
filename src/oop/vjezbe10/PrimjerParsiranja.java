package oop.vjezbe10;

public class PrimjerParsiranja {


    public static void parsiraj(int[] ulaz, String[] podaci) {
        for (int i = 0; i < podaci.length; i++) {
            ulaz[i] = Integer.parseInt(podaci[i]);
        }


        System.out.println("Konverzija uspjela.");
    }


    public static void main(String[] args) {
        int[] niz = new int[5];


        String[] podaci = {"10", "25", "12", "40", "50", "40"};


        try {
            parsiraj(niz, podaci);
        } catch (NumberFormatException e) {
            System.out.println("Greška u unosu: unesena vrijednost nije broj.");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Greška: broj ulaznih vrijednosti je veći od duljine niza.");
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Dogodila se runtime pogreška.");
            System.out.println(e.getMessage());
        }


        System.out.println("Program nastavlja dalje.");
    }
}
