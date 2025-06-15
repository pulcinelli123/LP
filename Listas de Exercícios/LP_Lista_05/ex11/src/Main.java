import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();

        System.out.print("Informe o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();

        System.out.print("Informe o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();

        System.out.print("Informe o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Multiplicação impossível! O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        } else {
            int[][] A = new int[linhasA][colunasA];
            int[][] B = new int[linhasB][colunasB];
            int[][] resultado = new int[linhasA][colunasB];

            System.out.println("\nDigite os elementos da primeira matriz:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasA; j++) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    A[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nDigite os elementos da segunda matriz:");
            for (int i = 0; i < linhasB; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print("B[" + i + "][" + j + "]: ");
                    B[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    for (int k = 0; k < colunasA; k++) { // ou k < linhasB, tanto faz aqui
                        resultado[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("\nMatriz Produto:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(resultado[i][j] + "\t");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
