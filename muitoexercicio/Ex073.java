package muitoexercicio;
import java.util.Scanner;

public class Ex073 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número limite para a sequência de Fibonacci: ");
        int limite = entrada.nextInt();
        int a = 0, b = 1, temp;

        for (; a <= limite;) {
            System.out.println(a);
            temp = a;
            a = b;
            b = temp + b;
        }
    }
}