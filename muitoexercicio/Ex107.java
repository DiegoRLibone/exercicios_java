package muitoexercicio;
import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produtoDiagonal = 1;

        // Lendo a matriz e calculando o produto da diagonal secundária
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numero.nextInt();
                if (i + j == 2) {
                    produtoDiagonal *= matriz[i][j];
                }
            }
        }
        System.out.println("Produto da diagonal secundária: " + produtoDiagonal);
    }
}