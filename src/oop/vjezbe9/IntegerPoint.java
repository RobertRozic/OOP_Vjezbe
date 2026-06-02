package oop.vjezbe9;

public class IntegerPoint {
    private Integer x;
    private Integer y;

    public IntegerPoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "IntegerPoint [x=" + x + ", y=" + y + "]";
    }
}