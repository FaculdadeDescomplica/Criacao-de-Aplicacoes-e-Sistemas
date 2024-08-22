package buscas;

public class BuscaSequencial {

    public static int buscaSequencial(int[] arr, int valor) {
        // Percorrendo cada elemento do array
        for (int i = 0; i < arr.length; i++) {
            // Se o elemento atual é igual ao valor buscado, retorna o índice
            if (arr[i] == valor) {
                return i;
            }
        }
        // Se o valor não for encontrado, retorna -1
        return -1;
    }

    public static void main (String [] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valorBuscado = 60;

        int resultado = buscaSequencial(numeros, valorBuscado);

        if (resultado != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado no índice " + resultado);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado.");
        }
    }
}
