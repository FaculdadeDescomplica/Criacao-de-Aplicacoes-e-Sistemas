package instrucoes;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        int numero = 10;

        // 1. Estrutura if
        numero = -10;
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }

        // 2. Estrutura if-else
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // 3. Estrutura if-else if-else if-else ANINHADO
        numero = 0;
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else if (numero == 0) {
            System.out.println("O número é zero.");
        }

        // 3. Exemplo de aula com o 20 if-else ANINHADO
        numero = 20;
        if (numero > 20) {
            System.out.println("O número é maior que 20.");
        } else if (numero < 19) {
            System.out.println("O número é menor que 19.");
        } else if (numero == 0) {
            System.out.println("O número é zero.");
        } else {
            System.out.println("Outro");
        }
    }
}