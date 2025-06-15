public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando a matriz 5x5
        int[][] matriz = {
                { 1,  2,  3,  4,  5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        // Exibindo a matriz (opcional, só pra visualizarmos)
        System.out.println("Matriz completa:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a diagonal secundária
        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }
    }
}
