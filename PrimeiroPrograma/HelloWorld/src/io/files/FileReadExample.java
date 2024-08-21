package io.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// LEITURA
public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("arquivo.txt"))) {
            String linha;
            while (
                    (linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
