package muitoexercicio;
import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = entrada.nextFloat();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado!");
        } else {
            System.out.println(nome + " está em recuperação.");
        }
    }
}