package muitoexercicio;
import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int num = entrada.nextInt();
        int divisor = 1;

        do {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        } while (divisor <= num);
    }
}