package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

// ARQUIVO NÃO EXECUTÁVEL APENAS EXEMPLO

public class SintaxeBasica {
    // Scanner para iniciar
    Scanner scanner = new Scanner(System.in);

    // fazer AÇÕES de leitura

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");

    // Scanner para fechar
    scanner.close();

    // ----------------
    // BufferedReader

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nome = reader.readLine();
    int idade = Integer.parseInt(reader.readLine());


    // ----------------
    // PrintWriter (EXTRA)

    PrintWriter writer = new PrintWriter(System.out, true);
    writer.println("Hello, World!"); // Imprime uma linha de texto
    writer.printf("Nome: %s, Idade: %d%n", "João", 30); // Imprime com formatação

}