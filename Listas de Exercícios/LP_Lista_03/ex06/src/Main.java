import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma opção (5 a 9): ");
        opcao = in.nextInt();

        if (opcao >= 5 && opcao <= 9) {
            System.out.println("Opção escolhida: " + opcao);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
