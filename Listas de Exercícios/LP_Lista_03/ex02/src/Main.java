import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raiz, valor1, valor2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        valor1 = in.nextInt();

        System.out.println("Digite outro valor: ");

        valor2 = in.nextInt();

        if (valor1 < valor2) {
            System.out.println("Valor 2 maior que valor 1");
        }else {
            System.out.println("Valor 1 maior que valor 2");
        }


    }
}
