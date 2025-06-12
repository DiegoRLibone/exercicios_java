package muitoexercicio;
import java.util.Arrays;
import java.util.Scanner;

public class Ex086 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = numero.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}