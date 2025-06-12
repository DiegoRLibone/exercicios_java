package muitoexercicio;
import java.util.Scanner;

public class Ex094 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Números pares digitados:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}