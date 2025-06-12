package muitoexercicio;
import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menor = Integer.MAX_VALUE;

        // Lendo os valores da matriz e verificando o menor valor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Menor valor na matriz: " + menor);
    }
}