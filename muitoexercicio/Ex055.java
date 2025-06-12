package muitoexercicio;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num = entrada.nextInt();
        int i = 1;

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}