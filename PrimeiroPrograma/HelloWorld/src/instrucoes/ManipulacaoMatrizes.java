package instrucoes;

public class ManipulacaoMatrizes {
    public static void main (String [] args) {
        int[][] matriz = { {1, 2, 3}, {4, 5, 6} };

        System.out.println("Mostrar MATRIZ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) { // matriz[i].length
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        System.out.println("\n Valor da primeira linha e segunda coluna = " + matriz[0][1]);
        // Imprime o valor da primeira linha e segunda coluna (2)

        matriz[1][2] = 10; // Modifica o valor da segunda linha e terceira coluna para 10
        System.out.println("\n Novo valor = " +matriz[1][2]); // Imprime o novo valor (10)

        System.out.println("\nMostrar MATRIZ atualizada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }

}