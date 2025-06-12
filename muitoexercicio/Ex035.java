package muitoexercicio;
import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0, media;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += entrada.nextInt();
        }

        media = soma / 3;

        if (media >= 7) {
            System.out.println("está aprovado!");
        } else {
            System.out.println("está em reprovado.");
        }
    }
}
