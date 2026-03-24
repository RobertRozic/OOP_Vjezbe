package oop.models;

import oop.interfaces.Oblik;

public class Krug implements Oblik {
    private double r;

    public Krug(double r) {
        this.r = r;
    }

    @Override
    public double povrsina() {
        return Math.PI * r * r;
    }
}
