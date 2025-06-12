package muitoexercicio;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner maiorNumero = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = maiorNumero.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = maiorNumero.nextInt();

        if (num1>num2){
            System.out.println("O número " + num1 + "é maior");
        } else {
            System.out.println("O número " + num2 + "é maior");
        }
    }
}
