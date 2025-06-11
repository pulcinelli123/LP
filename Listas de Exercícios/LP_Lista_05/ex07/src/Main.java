import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorSomaLinha = 0;
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha || i == 0) {
                maiorSomaLinha = somaLinha;
            }
        }

        int maiorSomaColuna = 0;
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna || j == 0) {
                maiorSomaColuna = somaColuna;
            }
        }

        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);

        scanner.close();
    }
}
