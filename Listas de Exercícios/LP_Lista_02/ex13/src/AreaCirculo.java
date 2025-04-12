import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("A área do círculo é: %.2f\n", area);

        input.close();
    }
}
