import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break; // Sai do laço quando encontrar
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }

        scanner.close();
    }
}
