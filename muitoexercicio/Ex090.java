package muitoexercicio;
import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean temZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            if (numero.nextInt() == 0) {
                temZero = true;
            }
        }

        if (temZero) {
            System.out.println("Existe pelo menos um número igual a zero.");
        } else {
            System.out.println("Nenhum número é zero.");
        }
    }
}