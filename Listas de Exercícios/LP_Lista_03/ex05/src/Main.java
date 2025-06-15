import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota, media, nota2;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o a sua nota: ");
        nota = in.nextDouble();
        System.out.println("Informe o a sua nota: ");
        nota2 = in.nextDouble();

        media = (nota+nota2) / 2;

        if (media >= 8.5){
            System.out.println("Conceito A");
        }else if ( media >=7){
            System.out.println("Conceito B");
        }else if ( media >= 5){
            System.out.println("Conceito C");
        }else{
            System.out.println("Cocnceito D");
        }
    }
}