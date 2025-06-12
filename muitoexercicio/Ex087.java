package muitoexercicio;
import java.util.Scanner;

public class Ex087 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int positivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            if (numero.nextInt() > 0) {
                positivos++;
            }
        }
        System.out.println("Quantidade de números positivos: " + positivos);
    }
}