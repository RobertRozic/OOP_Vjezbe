package oop.vjezbe8;

public abstract class Lik {
    protected double a;
    protected double b;

    public Lik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double povrsina();

    public abstract String tip();

    public void ispisiPodatke() {
        System.out.println(this.tip() + " sa vrijednostima: " + a + " i " + b);
        System.out.println("Povrsina: " + this.povrsina());
    }
}
