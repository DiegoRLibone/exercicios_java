package muitoexercicio;
import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número " + i + ": ");
            soma += entrada.nextInt();
        }

        float media = soma / 5.0f;
        System.out.println("Média: " + media);
    }
}