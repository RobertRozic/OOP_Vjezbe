package oop.vjezbe10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class CitanjeDatoteke {
    public static void main(String[] args) {
        Path putanja = Path.of("studenti.txt");


        try (BufferedReader reader = Files.newBufferedReader(putanja, StandardCharsets.UTF_8)) {
            String linija;

            while ((linija = reader.readLine()) != null) {
                System.out.println(linija);
            }
        } catch (IOException e) {
            System.out.println("Greška pri čitanju datoteke: " + e.getMessage());
        }
    }
}

