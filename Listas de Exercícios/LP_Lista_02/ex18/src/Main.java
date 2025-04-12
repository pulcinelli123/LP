import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = input.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = input.nextDouble();

        // Verificação das condições
        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação possui infinitas soluções.");
            } else {
                System.out.println("A equação não possui solução.");
            }
        } else {
            double x = -b / a;
            System.out.printf("A solução da equação é: x = %.2f\n", x);
        }

        input.close();
    }
}
