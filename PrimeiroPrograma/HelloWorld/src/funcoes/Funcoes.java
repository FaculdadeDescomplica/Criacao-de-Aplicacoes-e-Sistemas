package funcoes;

public class Funcoes {
    // Função: Retorna um valor do tipo int
    public static int soma(int a, int b) {
        return a + b; // Retorna a soma de a e b
    }

    public static int subtracao() {
        int a = 100;
        int b = 60;

        return a - b; // Retorna a soma de a e b
    }

    // Procedimento (void): Não retorna valor
    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem); // Imprime a mensagem no console
    }

    public static void imprimirNaTela() {
        System.out.println("Essa função não tem um parâmetro"); // Imprime a mensagem no console
    }

    public static void main(String[] args) {
        // Usando a função soma
        int resultado = soma(5, 7);
        System.out.println("O resultado da soma é: " + resultado);
        System.out.println("O resultado da soma é: " + soma(60, 40));

        // Usando a função subtracao
        System.out.println("O resultado da subtração é: " + subtracao());

        // Usando o procedimento imprimirMensagem
        imprimirMensagem("Olá, esta é uma mensagem de exemplo!");

        // Usando o procedimento sem parâmetro
        imprimirNaTela();
    }
}