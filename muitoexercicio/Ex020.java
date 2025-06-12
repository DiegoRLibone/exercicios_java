package muitoexercicio;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();

        System.out.println(num % 2 == 0 ? "Par" : "Ímpar");
    }
}