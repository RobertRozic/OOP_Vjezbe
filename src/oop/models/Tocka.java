package oop.models;

public class Tocka {
    private double x = 0.0;
    private double y = 0.0;

    public Tocka() {
    }

    public Tocka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dajX() {
        return this.x;
    }

    public double dajY() {
        return this.y;
    }

    public void postaviX(double x) {
        this.x = x;
    }

    public void postaviY(double y) {
        this.y = y;
    }

    public double udaljenost(Tocka t) {
        return Math.sqrt(
                Math.pow(this.x - t.dajX(), 2) +
                        Math.pow(this.y - t.dajY(), 2)
        );
    }
}