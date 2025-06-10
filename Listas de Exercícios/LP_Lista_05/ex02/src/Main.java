public class Main {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // Índice par
                vetor[i] += 2;
            } else { // Índice ímpar
                vetor[i] *= 2;
            }
        }

        System.out.println("\n\nVetor alterado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
