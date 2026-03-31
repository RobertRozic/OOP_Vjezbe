package oop.models;

public class Food extends Item {
    public Food(String sku, String name, double price) {
        super(sku, name, price);
    }

    @Override
    public String getItemType() {
        return "Food";
    }

    @Override
    public double getVAT() {
        return 0.1;
    }
}
