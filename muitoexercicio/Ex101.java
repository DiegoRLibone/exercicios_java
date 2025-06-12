package muitoexercicio;
import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        // Preenchendo a matriz e somando os valores
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / (4 * 4);
        System.out.println("Média dos elementos: " + media);
    }
}