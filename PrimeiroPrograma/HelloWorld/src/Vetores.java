public class Vetores {
    public static void main (String [] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Inicialização com valores
        String[] names = {"Alice", "Bob", "Charlie"}; // Inicialização com valores

        int[] numeros = new int[5]; // Inicialização de um vetor de 5 inteiros
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        String[] nomes = new String[3]; // Inicialização de um vetor de 3 strings

        // mostrar
        System.out.println("Vetor de números inic valores: "+ numbers);
        System.out.println("Vetor de números inic manualmente: "+ numeros);

        // percorrer
        System.out.println("Valores do vetor usando FOR");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elementos na posição [" + i + "]:" + numbers[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos na posição [" + i + "]:" + numeros[i]);
        }
    }
}
