package muitoexercicio;
import java.util.Scanner;

public class Ex074 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            soma += entrada.nextInt();
        }

        float media = soma / 5.0f;
        System.out.println("Média das idades: " + media);
    }
}