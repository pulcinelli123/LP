import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita o raio ao usuário
        System.out.print("Digite o raio do cilindro: ");
        double raio = input.nextDouble();

        // Solicita a altura ao usuário
        System.out.print("Digite a altura do cilindro: ");
        double altura = input.nextDouble();

        // Calcula o volume
        double volume = Math.PI * raio * raio * altura;

        // Exibe o resultado
        System.out.printf("O volume do cilindro é: %.2f\n", volume);

        input.close();
    }
}
