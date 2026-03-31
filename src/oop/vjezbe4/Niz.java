package oop.vjezbe4;

public class Niz {
    public static void main(String[] args) {
        int[] ocjene = {5, 4, 5, 3};
        double suma = 0.0;

        for (int i = 0; i < ocjene.length; i++) {
            suma += ocjene[i];
        }

        System.out.println("Suma je:" + suma);

        for (int ocjena : ocjene) {
            System.out.println(ocjena);
        }
    }
}
