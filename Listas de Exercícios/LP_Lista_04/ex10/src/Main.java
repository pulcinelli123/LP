import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci você quer ver: ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            // Calcula o próximo termo
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
