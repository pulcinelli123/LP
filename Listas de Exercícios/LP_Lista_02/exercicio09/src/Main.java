import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double medida, result;

        System.out.println("Digite sua medida em km/h: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        medida = in.nextDouble();

        result = medida / 1.609;
        System.out.println("A sua medida em km/h convertida para milhas é: " +result);

    }
}