package oop.vjezbe6;

public class Paket {
    private String brojPosiljke;
    private String primatelj;
    protected double tezina = 1.0;

    private static int brojacPaketa = 0;

    public Paket(String brojPosiljke, String primatelj, double tezina) {
        this.brojPosiljke = brojPosiljke;
        this.primatelj = primatelj;
        this.tezina = tezina;
        brojacPaketa++;
    }

    public double izracunajCijenu() {
        return 5 + tezina * 2;
    }

    public String getTip() {
        return "Paket";
    }

    public final String getBrojPosiljke() {
        return brojPosiljke;
    }

    public static int getBrojacPaketa() {
        return brojacPaketa;
    }

    public String getPrimatelj() {
        return primatelj;
    }
}
