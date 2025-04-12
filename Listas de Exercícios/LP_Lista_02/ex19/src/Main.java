import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = input.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = input.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = input.nextDouble();

        // Verifica se é equação do 2º grau
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("A equação possui uma raiz real: x = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("As raízes da equação são:\nx1 = %.2f\nx2 = %.2f\n", x1, x2);
            }
        }

        input.close();
    }
}
