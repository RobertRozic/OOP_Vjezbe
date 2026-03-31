package oop.models;

public class Cloth extends Item {
    public Cloth(String sku, String name, double price) {
        super(sku, name, price);
    }

    @Override
    public String getItemType() {
        return "Cloth";
    }

    @Override
    public double getVAT() {
        return 0.25;
    }
}
