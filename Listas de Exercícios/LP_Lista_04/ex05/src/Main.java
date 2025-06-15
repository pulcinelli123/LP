import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = input.nextInt();
        int fatorial = 1;

        for (int i = 1; i <=n; i++){
            fatorial *= i;

        }

        System.out.println(n + "! = "+ fatorial);
        input.close();
    }
}
