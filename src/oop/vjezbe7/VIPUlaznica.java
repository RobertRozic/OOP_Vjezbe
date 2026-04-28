package oop.vjezbe7;

public class VIPUlaznica extends Ulaznica {

    private boolean ukljucenSnack = false;

    public VIPUlaznica(String oznaka, String nazivFilma, int brojKarata, boolean ukljucenSnack) {
        super(oznaka, nazivFilma, brojKarata);
        this.ukljucenSnack = ukljucenSnack;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = brojKarata * 12.0;

        if (ukljucenSnack) {
            cijena += 3 * brojKarata;
        }

        if (brojKarata > 3) {
            cijena = cijena * 0.9;
        }

        return cijena;
    }

    @Override
    public String getTip() {
        return "VIP Ulaznica";
    }
}
