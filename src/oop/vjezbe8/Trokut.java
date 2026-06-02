package oop.vjezbe8;

public class Trokut extends Lik {
    public Trokut(double a, double b) {
        super(a, b);
    }

    @Override
    public String tip() {
        return "Trokut";
    }

    @Override
    public double povrsina() {
        return (a * b) / 2;
    }
}
