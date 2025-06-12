package muitoexercicio;

import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, soma = 0;

        do {
            System.out.print("Digite um número: ");
            soma += entrada.nextInt();
            contador++;
        } while (contador < 5);

        float media = soma / 5.0f;
        System.out.println("Média: " + media);

        entrada.close();
    }
}