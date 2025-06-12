package muitoexercicio;
import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o turno (M para Matutino, V para Vespertino): ");
        String turno = entrada.next().toUpperCase();

        if (turno.equals("M")) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (turno.equals("V")) {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Turno inválido.");
        }
    }
}