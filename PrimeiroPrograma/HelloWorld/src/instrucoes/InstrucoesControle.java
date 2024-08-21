package instrucoes;

public class InstrucoesControle {
    public static void main (String [] args) {
        System.out.println("BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Encerra o loop quando i é igual a 5
            }
            System.out.println("Iteração: " + i);
        }

        System.out.println("\nCONTINUE");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a iteração para números pares
            }
            System.out.println("Iteração ímpar: " + i);
        }

    }
}
