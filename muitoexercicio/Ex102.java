package muitoexercicio;
import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz1 = new int[2][2], matriz2 = new int[2][2], resultado = new int[2][2];

        // Lendo primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz1[i][j] = numero.nextInt();

        // Lendo segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = numero.nextInt();

        // Multiplicando as matrizes
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                resultado[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];

        // Exibindo a matriz resultante
        System.out.println("Matriz resultante do produto:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}