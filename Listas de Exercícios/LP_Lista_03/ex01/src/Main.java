import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double raiz, valor;
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o valor: ");

    valor = in.nextDouble();

    if(valor >= 0) {
        raiz = Math.sqrt(valor);
        System.out.printf("A raiz quadrada de %.2f é %.2f%n", valor, raiz);

    }else {
        System.out.println("Valor invalido!");

    }

    }
}
