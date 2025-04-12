import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a velocidade inicial (m/s): ");
        double v0 = input.nextDouble();

        System.out.print("Digite a aceleração (m/s²): ");
        double a = input.nextDouble();

        System.out.print("Digite o tempo (s): ");
        double t = input.nextDouble();

        // Cálculo da velocidade final
        double v = v0 + a * t;

        // Resultado
        System.out.printf("A velocidade final é: %.2f m/s\n", v);

        input.close();
    }
}
