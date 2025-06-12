package muitoexercicio;
import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz1 = new int[2][2], matriz2 = new int[2][2];
        boolean saoIguais = true;

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz1[i][j] = numero.nextInt();

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = numero.nextInt();

        // Comparando as matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    saoIguais = false;
                    break;
                }
            }
        }
        System.out.println("As matrizes são " + (saoIguais ? "iguais!" : "diferentes."));
    }
}