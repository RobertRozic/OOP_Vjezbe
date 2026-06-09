package oop.vjezbe10;

public class PrimjerTryCatch {
    public static void main(String[] args) {
        int b = 42;
        int n = 2;

        try {
            System.out.println("Ulazak u try blok");
            System.out.println(b / n);
            System.out.println("Kraj try bloka");
        } catch (ArithmeticException e) {
            System.out.println("Dijeljenje s nulom nije dozvoljeno.");
        } finally {
            System.out.println("Nakon try/catch bloka.");
        }
    }

}
