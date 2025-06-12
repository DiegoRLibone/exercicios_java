package muitoexercicio;
import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;

        // Preenchendo a matriz e verificando o maior valor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor na matriz: " + maior);
    }
}
