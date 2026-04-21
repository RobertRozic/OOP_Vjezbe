package oop.vjezbe6;

public class LomljiviPaket extends Paket {
    private boolean osiguranje;

    public LomljiviPaket(String brojPosiljke, String primatelj, double tezina, boolean osiguranje) {
        super(brojPosiljke, primatelj, tezina);
        this.osiguranje = osiguranje;
    }

    @Override
    public double izracunajCijenu() {
        double total =  8 + tezina * 2.5;
        if (osiguranje) {
            total += 10;
        }
        return total;
    }

    @Override
    public String getTip() {
        return "Lomljivi";
    }
}
