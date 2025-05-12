import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, resultado;
        int opcao;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = in.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextDouble();

        System.out.println("Menu:\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
        opcao = in.nextInt();

        if (opcao == 1) {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 2) {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 3) {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 4) {
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Divisão por zero não permitida");
            }
        } else {
            System.out.println("Opção inválida");
        }
    }
}
