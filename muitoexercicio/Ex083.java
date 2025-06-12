package muitoexercicio;
import java.util.Scanner;

public class Ex083 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um número: ");
            soma += numero.nextInt();
        }

        double media = (double) soma / 7;
        System.out.println("Média aritmética: " + media);
    }
}