package oop.models;

public class Beverage extends Item {
    protected String volume;

    public Beverage(String sku, String name, double price, String volume) {
        super(sku, name, price);
        this.volume = volume;
    }

    @Override
    public String getItemType() {
        return "Beverage";
    }

    @Override
    public double getVAT() {
        return 0.15;
    }
}
