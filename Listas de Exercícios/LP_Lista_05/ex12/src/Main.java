public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 4, 3},
                {1, 5, 7},
                {8, 9, 6}
        };

        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        System.out.println("Determinante da matriz: " + determinante);
    }
}
