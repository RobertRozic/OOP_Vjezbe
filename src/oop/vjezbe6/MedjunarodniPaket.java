package oop.vjezbe6;

public class MedjunarodniPaket extends Paket {
    private int zona;

    public MedjunarodniPaket(String brojPosiljke, String primatelj, double tezina, int zona) {
        super(brojPosiljke, primatelj, tezina);
        this.zona = zona;
    }

    @Override
    public double izracunajCijenu() {
        double total = 10 + tezina * 3;

        switch (zona) {
            case 1:
                total += 5;
                break;
            case 2:
                total += 10;
                break;
            case 3:
                total += 20;
                break;
            default:
                break;
        }

        return total;
    }

    @Override
    public String getTip() {
        return "Medjunarodni";
    }
}
