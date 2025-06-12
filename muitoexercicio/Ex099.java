package muitoexercicio;
import java.util.Scanner;

public class Ex099 {
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

        // Somando as matrizes
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];

        // Exibindo a matriz resultado
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}