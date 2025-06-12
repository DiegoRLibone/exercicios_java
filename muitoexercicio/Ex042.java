package muitoexercicio;
import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int divisor = 2, qtdDivisores = 0;

        while (divisor < num) {
            if (num % divisor == 0) {
                qtdDivisores++;
            }
            divisor++;
        }

        if (qtdDivisores == 0 && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}