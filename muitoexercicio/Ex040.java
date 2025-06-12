package muitoexercicio;
import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num = entrada.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}