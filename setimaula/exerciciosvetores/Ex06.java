package setimaula.exerciciosvetores;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];

        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero[contador] = num.nextInt();
        }

        Arrays.sort(numero); // Ordena o vetor em ordem crescente

        System.out.println("\nNúmeros em ordem crescente:");
        for (int contador = 0; contador < 10; contador++) {
            System.out.print(numero[contador] + "\n");
        }
    }
}