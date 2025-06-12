package muitoexercicio;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        int anos;

        System.out.print("Digite sua idade: ");
        anos = idade.nextInt();

        String categoria;
        if (anos < 12) {
            categoria = "criança";
        } else if (anos < 18) {
            categoria = "adolescente";
        } else if (anos < 60) {
            categoria = "adulto";
        } else {
            categoria = "idoso";
        }

        System.out.println("Você é " + categoria);
    }
}