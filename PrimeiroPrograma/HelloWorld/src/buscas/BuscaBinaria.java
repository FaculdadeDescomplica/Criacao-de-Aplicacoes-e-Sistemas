package buscas;

public class BuscaBinaria {

    public static int buscaBinaria(int[] arr, int valor) {
        System.out.println("\nComeçando a busca Binária...");
        int esquerda = 0;
        int direita = arr.length - 1; // última posição

        System.out.println("Esquerda = " + esquerda + "\n Direita = " + direita);

        while (esquerda <= direita) {
            System.out.println("\nFazendo a busca ENQUANTO..." +
                    "\nEsquerda = " + esquerda + "\n Direita = " + direita);

            // Calcula o índice do meio
            int meio = (esquerda + direita) / 2;
            System.out.println("Meio = " + meio);

            // Se o valor do meio é igual ao valor procurado, retorna o índice
            if (arr[meio] == valor) {
                return meio;
            }

            // Se o valor do meio é maior, ignora a metade direita
            if (arr[meio] > valor) {
                direita = meio - 1;
            }
            // Se o valor do meio é menor, ignora a metade esquerda
            else {
                esquerda = meio + 1;
            }
        }

        // Se o valor não foi encontrado, retorna -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int valorBuscado = 40;

        System.out.println("Tamanho do array =  "+ numeros.length);
        int resultado = buscaBinaria(numeros, valorBuscado);

        if (resultado != -1) {
            System.out.println("\nValor " + valorBuscado + " encontrado no índice " + resultado);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado.");
        }
    }
}
