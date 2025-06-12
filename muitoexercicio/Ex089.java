package muitoexercicio;
import java.util.Scanner;

public class Ex089 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int positivos = 0, negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num > 0) positivos++;
            if (num < 0) negativos++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}