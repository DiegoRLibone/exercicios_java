package muitoexercicio;
import java.util.Scanner;

public class Ex065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0, contador = 0;
        String nome;

        do {
            System.out.print("Digite o nome (ou 'fim' para sair): ");
            nome = entrada.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            somaIdades += idade;
            contador++;
        } while (true);

        if (contador > 0) {
            System.out.println("Média das idades: " + (somaIdades / (float) contador));
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}