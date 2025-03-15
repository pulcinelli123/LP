import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double graus, result;

        System.out.println("Digite a qntd. em Graus Celsius: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        graus = in.nextDouble();


        result = (graus* 9/5) + 32;

        System.out.println("A quantidade de Graus celsius convertida para fahrenheit é:  "+ result);

    }
}