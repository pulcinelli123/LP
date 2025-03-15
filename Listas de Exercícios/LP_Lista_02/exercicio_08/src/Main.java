import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double medida, result;

        System.out.println("Digite sua medida em polegadas: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        medida = in.nextDouble();

        result = medida * 25.4;
        System.out.println("A sua medida em polegadas convertida para mm é: " +result);

    }
}