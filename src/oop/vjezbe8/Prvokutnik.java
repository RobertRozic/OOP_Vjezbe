package oop.vjezbe8;

public class Prvokutnik extends Lik {
    public Prvokutnik(double a, double b) {
        super(a, b);
    }

    @Override
    public String tip() {
        return "Pravokutnik";
    }

    @Override
    public double povrsina() {
        return a * b;
    }
}
