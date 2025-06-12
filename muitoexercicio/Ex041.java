package muitoexercicio;
import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int num = entrada.nextInt();
        int divisor = 1;

        while (divisor <= num) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}