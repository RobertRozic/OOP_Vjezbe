package oop.vjezbe9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EvidencijaStudenata {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Ana", "IT001", 82));
        studenti.add(new Student("Marko", "IT002", 45));
        studenti.add(new Student("Ivana", "IT003", 91));
        studenti.add(new Student("Luka", "IT004", 38));

        Iterator<Student> iterator = studenti.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getBodovi() < 50) {
                iterator.remove();
            }
        }

        Collections.sort(studenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getBodovi() - s1.getBodovi();
            }
        });

        Map<String, Student> mapaStudenata = new HashMap<>();
        for (Student s : studenti) {
            mapaStudenata.put(s.getIndeks(), s);
        }

        for (Student s : studenti) {
            System.out.println(s);
        }

        if (mapaStudenata.containsKey("IT004")) {
            System.out.println("Pretraga IT004: " + mapaStudenata.get("IT004"));
        } else {
            System.out.println("Student IT004 nije polozio.");
        }
    }
}


