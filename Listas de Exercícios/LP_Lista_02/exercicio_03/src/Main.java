import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result, number;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        result = number/5;
        System.out.println("A quinta parte de " + number + " é: " + result);

    }
}