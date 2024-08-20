package io;

import java.util.Scanner;

public class ScannerExample {
    public static void main (String [] args) {
        // Iniciar
        Scanner scanner = new Scanner(System.in);

        // Ações de leitura
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Ação de saída
        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");

        // Encerrar
        scanner.close();
    }
}
