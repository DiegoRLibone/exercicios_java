package muitoexercicio;
import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();

        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}