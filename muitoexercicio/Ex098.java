package muitoexercicio;
import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}