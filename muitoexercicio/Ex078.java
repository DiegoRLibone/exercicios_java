package muitoexercicio;
import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = numero.nextInt();

        String numStr = Integer.toString(num);
        for (char digito : numStr.toCharArray()) {
            System.out.println(digito);
        }
    }
}