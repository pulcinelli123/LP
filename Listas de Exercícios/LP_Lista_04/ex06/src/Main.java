import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita dois números inteiros ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Determina os limites inferior e superior
        int inicio = Math.min(num1, num2) + 1;
        int fim = Math.max(num1, num2);

        System.out.println("Números naturais entre " + num1 + " e " + num2 + ":");

        boolean encontrou = false;
        for (int i = inicio; i < fim; i++) {
            if (i >= 0) { // Apenas naturais (0 ou positivos)
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum número natural entre os valores digitados.");
        }

        scanner.close();
    }
}
