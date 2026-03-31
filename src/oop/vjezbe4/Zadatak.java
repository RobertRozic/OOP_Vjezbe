package oop.vjezbe4;

import oop.models.Beverage;
import oop.models.Cloth;
import oop.models.Food;
import oop.models.Item;

public class Zadatak {
    public static void main(String[] args) {
        Item test = new Item("123456", "Coca Cola", 2.5);
        Item test2 = new Item("31231", "Pizza");

        double cijena = test.getPrice(1);
        System.out.println("Cijena 1 Coca Cole je:" + cijena);

        System.out.println(test);

        // Kosarica
        Item[] items = new Item[3];

        items[0] = new Beverage("123456", "Coca Cola", 2.5, "0.25L");
        items[1] = new Food("123128312", "Pizza", 15);
        items[2] = new Cloth("2311231", "Majica", 25);

        double ukupno = 0.0;

        for (Item i : items) {
            ukupno += i.getPrice(1);
        }

        System.out.println("Cijena kosarice je:" + ukupno);
    }
}
