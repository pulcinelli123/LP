import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita o raio
        System.out.print("Digite o raio da base do cone: ");
        double raio = input.nextDouble();

        // Solicita a altura
        System.out.print("Digite a altura do cone: ");
        double altura = input.nextDouble();

        // Calcula o volume do cone
        double volume = (1.0 / 3) * Math.PI * raio * raio * altura;

        // Exibe o resultado
        System.out.printf("O volume do cone é: %.2f\n", volume);

        input.close();
    }
}
