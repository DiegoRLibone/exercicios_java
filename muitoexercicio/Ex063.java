package muitoexercicio;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();

        do {
            System.out.println(num % 10);
            num /= 10;
        } while (num > 0);
    }
}