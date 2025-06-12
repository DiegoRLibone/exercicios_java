package muitoexercicio;
import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else if (idade >= 16 || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Não pode votar.");
        }
    }
}