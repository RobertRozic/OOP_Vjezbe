package oop.vjezbe9;


import java.util.HashMap;
import java.util.Map;

public class MapaStudenata {
    public static void main(String[] args) {
        Map<String, Student> studenti = new HashMap<>();

        studenti.put("IT001", new Student("Ana", "IT001", 82));
        studenti.put("IT002", new Student("Marko", "IT002", 65));
        studenti.put("IT003", new Student("Ivana", "IT003", 91));

        Student s = studenti.get("IT003");
        System.out.println("Pronadeni student: " + s);

        if (studenti.containsKey("IT002")) {
            System.out.println("Student IT002 postoji u mapi.");
        }
    }
}

