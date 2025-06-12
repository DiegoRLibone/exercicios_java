package muitoexercicio;
import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = entrada.nextInt();

        double preco = quantidade < 12 ? 0.50 : 0.40;
        double total = quantidade * preco;

        System.out.println("Total a pagar: R$" + total);
    }
}