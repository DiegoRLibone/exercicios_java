package muitoexercicio;
import java.util.Arrays;
import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[][] matriz1 = new int[2][2], matriz2 = new int[2][2], resultado = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz1[i][j] = numero.nextInt();

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = numero.nextInt();

        // Subtraindo as matrizes
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];

        System.out.println("Matriz resultante da subtração:");
        for (int[] linha : resultado)
            System.out.println(Arrays.toString(linha));
    }
}