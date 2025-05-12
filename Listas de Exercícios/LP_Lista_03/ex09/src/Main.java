import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        a = in.nextInt();
        System.out.println("Digite o lado B: ");
        b = in.nextInt();
        System.out.println("Digite o lado C: ");
        c = in.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
