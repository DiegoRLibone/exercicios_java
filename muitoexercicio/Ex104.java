package muitoexercicio;
import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean ehSimetrica = true;

        // Lendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numero.nextInt();
            }
        }

        // Verificando se a matriz é igual à sua transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
        }

        System.out.println("A matriz é " + (ehSimetrica ? "simétrica!" : "não simétrica."));
    }
}