public class Main {
    public static void main(String[] args) {
        // Loop de 1 até 10 para a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Loop interno para multiplicar de 1 até 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Linha em branco para separar as tabuadas
            System.out.println();
        }
    }
}
