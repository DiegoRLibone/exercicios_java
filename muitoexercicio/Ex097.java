package muitoexercicio;
import java.util.Scanner;

public class Ex097 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        // Preenchendo a matriz e somando os valores
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma de todos os elementos: " + soma);
    }
}