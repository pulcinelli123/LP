import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, total;
        int opcao, parcelas;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        valor = in.nextDouble();

        System.out.println("Menu:\n1. Débito\n2. Pix\n3. Crédito");
        opcao = in.nextInt();

        if (opcao == 1) {
            total = valor * 0.95;
            System.out.println("Valor final da compra: R$ " + total);
        } else if (opcao == 2) {
            total = valor * 0.90;
            System.out.println("Valor final da compra: R$ " + total);
        } else if (opcao == 3) {
            System.out.println("Escolha o número de parcelas (até 10x): ");
            parcelas = in.nextInt();
            if (parcelas <= 4) {
                total = valor * 1.02;
            } else if (parcelas <= 10) {
                total = valor * 1.05;
            } else {
                System.out.println("Número de parcelas inválido");
                return;
            }
            System.out.println("Valor final da compra: R$ " + total);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
