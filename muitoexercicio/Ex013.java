package muitoexercicio;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
         Scanner calculo = new java.util.Scanner(System.in);

         int num1,num2;

        System.out.print("Digite o primeiro número: ");
        num1 = calculo.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = calculo.nextInt();

        for (int i = num2; i <= num1; i += num2) {
            if (i == num1) {
                System.out.println("É múltiplo");
            } else {
                System.out.println("Não é múltiplo");
            }
        }
    }
}

