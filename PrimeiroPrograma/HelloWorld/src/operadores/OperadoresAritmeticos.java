package operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int x = 15;
        int y = 5;

        int soma = x + y;       // Adição
        System.out.println("Soma: " + soma);

        int subtracao = x - y;  // Subtração
        System.out.println("Subtração: " + subtracao);


        int multiplicacao = x * y; // Multiplicação
        System.out.println("Multiplicação: " + multiplicacao);

        int divisao = x / y;    // Divisão
        System.out.println("Divisão: " + divisao);

        int modulo = x % y;     // Módulo (resto da divisão)
        System.out.println("Módulo: " + modulo);

        // operadores.Operadores de Incremento e Decremento
        int incremento = 10;
        int decremento = 10;

        incremento++; // Incremento (incrementa em 1)
        System.out.println("Valor após incremento: " + incremento);

        decremento--; // Decremento (subtrai 1)
        System.out.println("Valor após decremento: " + decremento);
        
    }

}
