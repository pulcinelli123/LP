import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = in.nextInt();
        System.out.println("Digite o segundo número: ");
        b = in.nextInt();
        System.out.println("Digite o terceiro número: ");
        c = in.nextInt();

        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}
