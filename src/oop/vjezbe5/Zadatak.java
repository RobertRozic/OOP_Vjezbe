package oop.vjezbe5;

public class Zadatak {
    public static void main(String[] args) {
        /*
        Vozilo test = new Vozilo("123-A-456", 2);
        Vozilo test2 = new Vozilo("111-K-111", 3);
        Vozilo test3 = new Automobil("222-O-333", 3, false);
        Vozilo test4 = new Automobil("444-K-444", 3, true);
        Vozilo test5 = new Motocikl("555-K-555", 5);

        System.out.println(test3.izracunajCijenu());
        System.out.println(test4.izracunajCijenu());
        System.out.println(test5.izracunajCijenu());
        System.out.println(Vozilo.getBrojacVozila());
         */

        Vozilo[] vozila = new Vozilo[3];

        vozila[0] = new Automobil("111-A-111", 4, false);
        vozila[1] = new Automobil("222-A-222", 3, true);
        vozila[2] = new Motocikl("333-A-333", 5);

        double ukupno = 0;
        int brojacVeciOd5 = 0;

        for (Vozilo v : vozila) {
            System.out.println("Tip: " + v.getTip());
            System.out.println("Registracija: " + v.getRegistracija());
            System.out.println("Cijena: " + v.izracunajCijenu());
            double cijena = v.izracunajCijenu();

            ukupno += cijena;

            if (cijena > 5) {
                brojacVeciOd5++;
            }

        }

        System.out.println("Ukupna cijena: " + ukupno);
        System.out.println("Broj vozila s cijenom vecom od 5: " + brojacVeciOd5);
        System.out.println("Ukupno objekata: " + Vozilo.getBrojacVozila());

    }
}
