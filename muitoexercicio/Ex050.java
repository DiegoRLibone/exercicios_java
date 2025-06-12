package muitoexercicio;
import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numStr = entrada.next(); // Lê o número como String

        int i = 0;
        while (i < numStr.length()) { // Percorre cada caractere
            System.out.println(numStr.charAt(i)); // Exibe cada dígito
            i++;
        }

    }
}