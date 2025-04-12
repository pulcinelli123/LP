import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, peso, media;

        System.out.println("Digite sua primeira nota: ");
        System.out.println("Digite sua segunda nota: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        peso = n2 * 2;
        media = (n1 + peso) / 3;
        System.out.println("A sua media é " +media);

    }
}