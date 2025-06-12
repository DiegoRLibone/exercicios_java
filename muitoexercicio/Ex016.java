package muitoexercicio;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int valor;

        System.out.print("Digite um número: ");
        valor = numero.nextInt();

        if (valor > 0) {
            System.out.println("O número é positivo.");
        } else if (valor < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
