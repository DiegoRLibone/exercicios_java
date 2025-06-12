package muitoexercicio;
import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean ehIdentidade = true;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = numero.nextInt();

        // Verificando matriz identidade (1 na diagonal principal e 0 nos demais)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    ehIdentidade = false;
                    break;
                }
            }
        }
        System.out.println("A matriz é " + (ehIdentidade ? "uma identidade!" : "não é uma identidade."));
    }
}