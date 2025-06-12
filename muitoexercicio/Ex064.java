package muitoexercicio;
import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int fatorial = 1, i = num;

        do {
            fatorial *= i;
            i--;
        } while (i > 0);

        System.out.println("Fatorial de " + num + " é " + fatorial);
    }
}