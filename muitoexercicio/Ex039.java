package muitoexercicio;
import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, soma = 0;

        while (contador < 5) {
            System.out.print("Digite um número: ");
            soma += entrada.nextInt();
            contador++;
        }

        float media = soma / 5.0f;
        System.out.println("Média: " + media);
    }
}