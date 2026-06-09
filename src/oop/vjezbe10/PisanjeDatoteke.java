package oop.vjezbe10;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class PisanjeDatoteke {
    public static void main(String[] args) {
        Path putanja = Path.of("studenti.txt");

        System.out.println(putanja);

        try (BufferedWriter writer = Files.newBufferedWriter(putanja, StandardCharsets.UTF_8)) {
            writer.write("Ana;85");
            writer.newLine();
            writer.write("Marko;72");
            writer.newLine();
            writer.write("Ivana;91");
        } catch (IOException e) {
            System.out.println("Greška pri pisanju datoteke: " + e.getMessage());
        }
    }
}

