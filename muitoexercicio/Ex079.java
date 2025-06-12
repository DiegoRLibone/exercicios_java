package muitoexercicio;
import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = numero.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
}