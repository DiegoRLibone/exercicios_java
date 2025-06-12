package muitoexercicio;
import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Lendo a matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matriz[i][j] = numero.nextInt();

        // Encontrando o maior valor de cada linha
        for (int i = 0; i < 4; i++) {
            int maior = Integer.MIN_VALUE;
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior valor na linha " + (i + 1) + ": " + maior);
        }
    }
}