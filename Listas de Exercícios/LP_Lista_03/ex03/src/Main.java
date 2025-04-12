import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a sua nota 1:" );
        System.out.println("Digite sua nota 2");

        n1 = in.nextDouble();
        n2 = in.nextDouble();

        media = (n1+n2)/2;

        if (media >= 50){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado");
        }
    }
}
