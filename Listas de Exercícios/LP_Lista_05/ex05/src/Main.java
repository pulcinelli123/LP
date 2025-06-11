public class Main {

    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] v2 = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        System.out.println("\n\nVetor invertido:");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
    }
}
