package oop.vjezbe6;

public class Zadatak {
    public static void main(String[] args) {
        Paket[] paketi = new Paket[4];

        paketi[0] = new Paket("P001", "Robert Rozic", 2.0);
        paketi[1] = new LomljiviPaket("P005", "Test Test", 1.0, false);
        paketi[2] = new LomljiviPaket("P004", "Test Test", 1.0, true);
        paketi[3] = new MedjunarodniPaket("P005", "Test Test", 1.0, 1);


        double zbroj = 0;
        int brojacVeciOd20 = 0;
        Paket najskuplji = paketi[0];

        for (Paket p: paketi) {
            double cijena = p.izracunajCijenu();
            System.out.println("Tip: "+ p.getTip());
            System.out.println("Broj posiljke: "+ p.getBrojPosiljke());
            System.out.println("Primatelj: "+ p.getPrimatelj());
            System.out.println("Cijena dostave: "+ cijena);
            System.out.println("-------------------------------");
            zbroj += cijena;

            if (cijena > 20) {
                brojacVeciOd20++;
            }

            if (cijena > najskuplji.izracunajCijenu()) {
                najskuplji = p;
            }
        }

        System.out.println("Ukupna cijena: " + zbroj);
        System.out.println("Paketi skuplji od 20: " + brojacVeciOd20);
        System.out.println("Ukupno paketa: " + Paket.getBrojacPaketa());


        if (zbroj > 60) {
            System.out.println("Skupa dostava.");
        } else {
            System.out.println("Standardna dostava.");
        }
        //System.out.println("Cijena p3 je: " + p3.izracunajCijenu());
        //System.out.println("Cijena p5 je: " + p5.izracunajCijenu());
        //System.out.println("Cijena p6 je: " + p6.izracunajCijenu());

    }
}
