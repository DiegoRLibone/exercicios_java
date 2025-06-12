package muitoexercicio;
import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num > 0) {
                somaPositivos += num;
            } else if (num < 0) {
                somaNegativos += num;
            }
        }

        System.out.println("Soma dos positivos: " + somaPositivos);
        System.out.println("Soma dos negativos: " + somaNegativos);
    }
}
