package oop.vjezbe7;

public class Vjezbe7 {
    public static void main(String[] args) {
        Ulaznica[] ulaznice = new Ulaznica[5];

        Ulaznica u1 = new Ulaznica("001", "Hail Mary Project", 2);
        Ulaznica u2 = new StudentskaUlaznica("002", "Hail Mary Project", 2, false);
        Ulaznica u3 = new StudentskaUlaznica("003", "Hail Mary Project", 2, true);
        Ulaznica u4 = new PremijernaUlaznica("004", "Hail Mary Project", 2, 1);
        Ulaznica u5 = new VIPUlaznica("005", "Hail Mary Project", 4, true);

        System.out.println("Cijena u1 je: " + u1.izracunajCijenu());
        System.out.println("Cijena u2 je: " + u2.izracunajCijenu());
        System.out.println("Cijena u3 je: " + u3.izracunajCijenu());
        System.out.println("Cijena u4 je: " + u4.izracunajCijenu());
        System.out.println("Cijena u5 je: " + u5.izracunajCijenu());

        ulaznice[0] = u1;
        ulaznice[1] = u2;
        ulaznice[2] = u3;
        ulaznice[3] = u4;
        ulaznice[4] = u5;

        double ukupno = 0;
        int veciOd25 = 0;
        Ulaznica najskuplja = ulaznice[0];

        for (Ulaznica u : ulaznice) {
            double cijena = u.izracunajCijenu();
            System.out.println(
                    u.getTip()
                    + " | " + u.getOznaka()
                    + " | " + u.getNazivFilma()
                    + " | " + u.getBrojKarata()
                    + " | " + cijena
            );

            ukupno += cijena;

            if (cijena > 25) {
                veciOd25++;
            }

            if (cijena > najskuplja.izracunajCijenu()) {
                najskuplja = u;
            }
        }

        System.out.println("Ukupna cijena: " + ukupno);
        System.out.println("Vise od 25: " + veciOd25);
        System.out.println("Najskuplja ulaznica: " + najskuplja.getOznaka());
        System.out.println("Ukupno ulaznica: " + Ulaznica.getBrojRezervacija());

        if (ukupno > 100) {
            System.out.println("Velika rezervacija!");
        }  else {
            System.out.println("Standardna rezervacija!");
        }


    }
}
