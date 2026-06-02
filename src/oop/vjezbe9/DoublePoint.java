package oop.vjezbe9;

public class DoublePoint {
    private Double x;
    private Double y;

    public DoublePoint(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "DoublePoint [x=" + x + ", y=" + y + "]";
    }
}