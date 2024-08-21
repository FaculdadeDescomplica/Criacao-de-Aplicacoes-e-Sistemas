package instrucoes;

public class ManipulacaoVetores {
    public static void main (String [] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // indices: [0][1][2][3][4] = comprimento = 5

        int comprimento = numeros.length; // Obtém o comprimento do vetor
        System.out.println("O comprimento do vetor é: " + comprimento);

        System.out.println("\nMostrar cada elemento: implementacao por extenso");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); // Imprime cada elemento do vetor
        }

        System.out.println("\nMostrar cada elemento: implementacao simplificado");
        for (int numero : numeros) { // int item : items
            System.out.println(numero); // Imprime cada elemento do vetor
        }
    }
}
