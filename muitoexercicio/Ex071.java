package muitoexercicio;
import java.util.Scanner;

public class Ex071 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int num = entrada.nextInt();

        for (int divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}