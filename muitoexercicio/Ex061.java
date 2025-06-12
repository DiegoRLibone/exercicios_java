package muitoexercicio;
import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int soma = 0, i = 2;

        do {
            soma += i;
            i += 2;
        } while (i <= num);

        System.out.println("Soma dos números pares: " + soma);
    }
}