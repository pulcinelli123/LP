import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dinheiro, troco;
        int opcao;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o dinheiro: ");
        dinheiro = in.nextDouble();

        System.out.println("Menu:\n1. Café Expresso R$ 0.50\n2. Café Longo R$ 1.00\n3. Capuccino R$ 2.50\n4. Chocolate R$ 2.00");
        opcao = in.nextInt();

        if (opcao == 1 && dinheiro >= 0.5) {
            troco = dinheiro - 0.5;
            System.out.println("Bebida selecionada: Café Expresso");
            System.out.println("Seu Troco: R$ " + troco);
        } else if (opcao == 2 && dinheiro >= 1.0) {
            troco = dinheiro - 1.0;
            System.out.println("Bebida selecionada: Café Longo");
            System.out.println("Seu Troco: R$ " + troco);
        } else if (opcao == 3 && dinheiro >= 2.5) {
            troco = dinheiro - 2.5;
            System.out.println("Bebida selecionada: Capuccino");
            System.out.println("Seu Troco: R$ " + troco);
        } else if (opcao == 4 && dinheiro >= 2.0) {
            troco = dinheiro - 2.0;
            System.out.println("Bebida selecionada: Chocolate");
            System.out.println("Seu Troco: R$ " + troco);
        } else {
            System.out.println("Opção inválida ou saldo insuficiente");
        }
    }
}
