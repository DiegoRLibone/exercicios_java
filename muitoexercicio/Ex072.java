package muitoexercicio;
import java.util.Scanner;

public class Ex072 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int qtdDivisores = 0;

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                qtdDivisores++;
            }
        }

        if (qtdDivisores == 0 && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}