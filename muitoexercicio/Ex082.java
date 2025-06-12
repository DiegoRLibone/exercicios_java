package muitoexercicio;
import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            soma += numero.nextInt();
        }

        System.out.println("Soma dos números: " + soma);
    }
}