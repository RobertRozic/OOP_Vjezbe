package oop.vjezbe9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPrimjer {
    public static void main(String[] args) {
        List<Integer> bodovi = new ArrayList<>();
        bodovi.add(55);
        bodovi.add(30);
        bodovi.add(75);
        bodovi.add(40);

        Iterator<Integer> iterator = bodovi.iterator();

        while (iterator.hasNext()) {
            int bod = iterator.next();
            if (bod < 50) {
                iterator.remove();
            }
        }

        System.out.println("Studenti koji su prosli: " + bodovi);
    }
}
