package muitoexercicio;
import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = numero.nextInt();
        }

        System.out.println("Números em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}