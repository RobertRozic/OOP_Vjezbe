package oop.vjezbe9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestKolekcije {
    public static void main(String[] args) {
        String[] array = {"Ena", "Mario", "Ivan", "Jelena", "Ana"};
        List<String> mojaLista = Arrays.asList(array);

        Collections.sort(mojaLista);
        System.out.println("Sortirano: " + mojaLista);

        int pozicija = Collections.binarySearch(mojaLista, "Ivan");
        System.out.println("Ivan je na poziciji " + pozicija);

        Collections.shuffle(mojaLista);
        System.out.println("Izmijesano: " + mojaLista);

        Collections.reverse(mojaLista);
        System.out.println("Obrnuto: " + mojaLista);
    }
}