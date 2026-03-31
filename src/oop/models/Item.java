package oop.models;

public class Item {
    private String sku;
    private String name;
    private double netSalePrice;

    public Item(String sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public Item(String sku, String name, double price) {
        this(sku, name);
        this.netSalePrice = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getNetSalePrice() {
        return netSalePrice;
    }

    public String getItemType() {
        return "Unknown";
    }

    public double getVAT() {
        return 0.17;
    }

    public double getPrice(int count) {
        return count * this.netSalePrice * (1 + this.getVAT());
    }

    @Override
    public String toString() {
        return this.sku + " - " + this.name;
    }
}
