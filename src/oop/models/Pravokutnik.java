package oop.models;

import oop.interfaces.Oblik;

public class Pravokutnik implements Oblik {
    private double a;
    private double b;

    public Pravokutnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }
}
