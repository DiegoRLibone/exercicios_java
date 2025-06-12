package muitoexercicio;
import java.util.Scanner;

public class Ex093 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num >= 10 && num <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 10 e 50: " + contador);
    }
}