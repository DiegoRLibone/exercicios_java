package muitoexercicio;
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float media, soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += entrada.nextFloat();
        }

        media = soma / 3;

        System.out.println("Média: " + media);
        if (media >= 7){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
