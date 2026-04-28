package oop.vjezbe7;

public class PremijernaUlaznica extends Ulaznica {
    private int zona = 1;

    public PremijernaUlaznica(String oznaka, String nazivFilma, int brojKarata, int zona) {
        super(oznaka, nazivFilma, brojKarata);
        this.zona = zona;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = getBrojKarata() * 8.0;

        switch (zona) {
            case 1:
                cijena += 4;
                break;
            case 2:
                cijena += 2;
                break;
            case 3:
            case 4:
            default:
                break;
        }

        return cijena;
    }

    @Override
    public String getTip() {
        return "Premijerna ulaznica";
    }
}
