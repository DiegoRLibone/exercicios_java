package muitoexercicio;
import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int divisor = 2, qtdDivisores = 0;

        do {
            if (num % divisor == 0) {
                qtdDivisores++;
            }
            divisor++;
        } while (divisor < num);

        if (qtdDivisores == 0 && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}