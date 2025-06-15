public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando a matriz A (3x2)
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Declarando e inicializando a matriz B (2x2)
        int[][] B = {
                {7, 8},
                {9, 10}
        };

        // Criando a matriz resultado (3x2)
        int[][] resultado = new int[3][2];

        // Calculando o produto das matrizes
        for (int i = 0; i < 3; i++) { // Percorre as linhas da matriz A
            for (int j = 0; j < 2; j++) { // Percorre as colunas da matriz B
                resultado[i][j] = 0; // Inicializa a posição
                for (int k = 0; k < 2; k++) { // Percorre os elementos para multiplicar
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibindo a matriz resultado
        System.out.println("Matriz Produto:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
