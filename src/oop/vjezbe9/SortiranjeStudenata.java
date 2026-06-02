package oop.vjezbe9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortiranjeStudenata {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", "IT001", 82));
        studenti.add(new Student("Marko", "IT002", 65));
        studenti.add(new Student("Ivana", "IT003", 91));

        Comparator<Student> poBodovima = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getBodovi() - s1.getBodovi();
            }
        };

        Collections.sort(studenti, poBodovima);

        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}
