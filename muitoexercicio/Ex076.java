package muitoexercicio;
import java.util.Scanner;

public class Ex076 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = numero.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos números pares: " + soma);
    }
}