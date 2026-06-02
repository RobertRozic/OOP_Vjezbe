package oop.vjezbe9;

public class Vjezbe9 {
    public static void main(String[] args) {
        IntegerPoint t1 = new IntegerPoint(4, 5);
        DoublePoint t2 = new DoublePoint(4.9, 5.8);
        Point<Integer> t3 = new Point<>(4, 5);
        Point<Double> t4 = new Point<>(4.4, 5.5);
        Point<String> t5 = new Point<>("A1", "B2");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
