package muitoexercicio;
import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}