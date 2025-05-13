import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;

        System.out.println("Informe um número: ");
        n1 = input.nextDouble();

        System.out.println("A tabuada do "+ n1 +":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }

    }
}