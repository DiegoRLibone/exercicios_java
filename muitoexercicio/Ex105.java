package muitoexercicio;
import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        // Lendo a matriz e somando valores por coluna
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = numero.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }

        // Exibindo a soma de cada coluna
        for (int j = 0; j < 4; j++) {
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColunas[j]);
        }
    }
}