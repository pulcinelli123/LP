import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2, notarec, media, media1;


        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor da primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Informe o valor da segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 50) {
            System.out.println("Aprovado! Sua média foi de: " + media);

        } else  {
            System.out.println("Informe a nota da sua recuperação: ");
            notarec = in.nextDouble();

            media1 = (media + notarec) / 3;

            if (media1 >= 50) {
                System.out.println("Aprovado! Sua média foi de: " + media1);

            } else {
                System.out.println("Reprovado! Sua média foi de: " + media1);
            }

        }

    }
}