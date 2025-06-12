package muitoexercicio;
import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 5): ");
        int codigo = produto.nextInt();
        System.out.print("Quantos você quer comprar? ");
        int quantidade = produto.nextInt();

        double preco;

        if (codigo == 1) {
            preco = 10.0;
        } else if (codigo == 2) {
            preco = 20.0;
        } else if (codigo == 3) {
            preco = 15.0;
        } else if (codigo == 4) {
            preco = 30.0;
        } else {
            preco = 25.0;
        }

        double total = preco * quantidade;

        System.out.println("O total a pagar é: R$" + total);
    }
}