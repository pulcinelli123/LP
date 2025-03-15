import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result, number;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        number = in.nextInt();

        result = number * 2;
        System.out.println("O dobro de " + number + " é: " + result);

    }
}