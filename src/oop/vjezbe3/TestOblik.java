package oop.vjezbe3;

import oop.interfaces.Oblik;
import oop.models.Krug;
import oop.models.Pravokutnik;

public class TestOblik {
    public static void main(String[] args) {
        Oblik o1 = new Krug(3);
        Oblik o2 = new Pravokutnik(4, 5);

        System.out.println(o1.povrsina());
        System.out.println(o2.povrsina());
    }
}
