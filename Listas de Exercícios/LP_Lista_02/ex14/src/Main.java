import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe a base do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();

        // Recebe a altura do triângulo
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Exibe o resultado
        System.out.printf("A área do triângulo é: %.2f\n", area);

        input.close();
    }
}
