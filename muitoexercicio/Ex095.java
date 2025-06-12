package muitoexercicio;
import java.util.Arrays;
import java.util.Scanner;

public class Ex095 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = name.next();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}