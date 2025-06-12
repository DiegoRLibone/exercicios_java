package muitoexercicio;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[]args){
        Scanner valor = new Scanner(System.in);

        double preco,total;
        int quantidade;

        System.out.println("Preço do produto: ");
        preco = valor.nextDouble();

        System.out.println("Quantidade: ");
        quantidade = valor.nextInt();

        if (quantidade >= 10){
            preco = preco - (preco * 0.10);
            System.out.println("O valor do produto, devido a quantidade, teve desconto de 10%");
        }

        total = preco * quantidade;

        System.out.printf("Valor total: R$ %.2f%n", total);
    }
}
