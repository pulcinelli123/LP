import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velocidade, result;

        System.out.println("Digite sua velocidade em m/s: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        velocidade = in.nextDouble();

        result = velocidade * 3.6;
        System.out.println("A sua velocidade em m/s convertida para km/h é: " +result);

    }
}