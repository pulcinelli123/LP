import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada das raízes
        System.out.print("Digite a primeira raiz (x1): ");
        double x1 = input.nextDouble();

        System.out.print("Digite a segunda raiz (x2): ");
        double x2 = input.nextDouble();

        // Calcula os coeficientes
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        // Exibe a equação montada
        System.out.printf("A equação do segundo grau é: x² ");

        if (b < 0) {
            System.out.printf("+ %.2fx ", Math.abs(b));
        } else {
            System.out.printf("- %.2fx ", b);
        }

        if (c < 0) {
            System.out.printf("- %.2f = 0\n", Math.abs(c));
        } else {
            System.out.printf("+ %.2f = 0\n", c);
        }

        input.close();
    }
}
