package muitoexercicio;
import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int somaIdades = 0, quantidade = 0;

        while (true) {
            System.out.print("Digite o nome (ou 'fim' para sair): ");
            String nome = numero.next();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = numero.nextInt();
            somaIdades += idade;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) somaIdades / quantidade;
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}