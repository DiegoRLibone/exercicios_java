package muitoexercicio;
import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menores = 0, maiores = 0, qtd, idade;

        System.out.print("Quantas pessoas deseja verificar? ");
        qtd = entrada.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = entrada.nextInt();
            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);
    }
}