package operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Usando o operador ternário para determinar o maior valor
        int maior = (a > b) ? a : b;

        // > < >= <=

        System.out.println("O maior valor entre " + a + " e " + b + " é: " + maior);
    }
}
