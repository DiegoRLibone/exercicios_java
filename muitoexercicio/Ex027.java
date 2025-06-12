package muitoexercicio;
import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o sexo ('M' para Masculino ou 'F' para Feminino): ");
        String sexo = entrada.next().toLowerCase();

        if ((sexo.equals("m") && idade >= 65) || (sexo.equals("f") && idade >= 60)) {
            System.out.println("Pode se aposentar!");
        } else {
            System.out.println("Ainda não pode se aposentar.");
        }
    }
}