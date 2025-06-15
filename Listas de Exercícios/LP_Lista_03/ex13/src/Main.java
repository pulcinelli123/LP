import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        double area, perimetro;
        Scanner in = new Scanner(System.in);

        System.out.println("Menu:\n1. Círculo\n2. Triângulo Retângulo\n3. Retângulo");
        opcao = in.nextInt();

        if (opcao == 1) {
            System.out.println("Informe o raio: ");
            double raio = in.nextDouble();
            area = Math.PI * raio * raio;
            perimetro = 2 * Math.PI * raio;
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + perimetro);
        } else if (opcao == 2) {
            System.out.println("Informe a base: ");
            double base = in.nextDouble();
            System.out.println("Informe a altura: ");
            double altura = in.nextDouble();
            area = (base * altura) / 2;
            double hipotenusa = Math.sqrt(base * base + altura * altura);
            perimetro = base + altura + hipotenusa;
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + perimetro);
        } else if (opcao == 3) {
            System.out.println("Informe a base: ");
            double base = in.nextDouble();
            System.out.println("Informe a altura: ");
            double altura = in.nextDouble();
            area = base * altura;
            perimetro = 2 * (base + altura);
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + perimetro);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
