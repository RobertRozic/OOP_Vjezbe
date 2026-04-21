package oop.vjezbe6;

public class StandardniPaket extends Paket {
    public StandardniPaket(String brojPosiljke, String primatelj, double tezina) {
        super(brojPosiljke, primatelj, tezina);
    }

    @Override
    public double izracunajCijenu() {
        double total =  4 + tezina * 1.5;
        if (tezina > 10) {
            total += 5;
        }
        return total;
    }

    @Override
    public String getTip() {
        return "Standardni";
    }
}
