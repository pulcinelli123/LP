import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}
