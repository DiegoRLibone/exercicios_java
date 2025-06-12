package muitoexercicio;
import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            if (numero.nextInt() % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}