import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double medida, result;

        System.out.println("Digite sua medida em mm: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        medida = in.nextDouble();

        result = medida / 25.4;
        System.out.println("A sua medida em mm convertida para polegadas é: " +result);

    }
}