package muitoexercicio;
import java.util.Scanner;

public class Ex096 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = numero.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}