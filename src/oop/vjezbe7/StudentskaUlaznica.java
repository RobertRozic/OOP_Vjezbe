package oop.vjezbe7;

public class StudentskaUlaznica extends Ulaznica {
    private boolean imaIndeks = false;

    public StudentskaUlaznica(String oznaka, String nazivFilma, int brojKarata, boolean imaIndeks) {
        super(oznaka, nazivFilma, brojKarata);
        this.imaIndeks = imaIndeks;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = getBrojKarata() * 5;

        if (imaIndeks) {
            cijena = cijena * 0.85;
        }

        return cijena;
    }

    @Override
    public String getTip() {
        return "Studentska ulaznica";
    }
}
