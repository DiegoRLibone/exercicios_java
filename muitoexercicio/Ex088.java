package muitoexercicio;
import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0, contPar = 0, contImpar = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = numero.nextInt();
            if (num % 2 == 0) {
                somaPar += num;
                contPar++;
            } else {
                somaImpar += num;
                contImpar++;
            }
        }

        double mediaPar = (contPar > 0) ? (double) somaPar / contPar : 0;
        double mediaImpar = (contImpar > 0) ? (double) somaImpar / contImpar : 0;

        System.out.println("Média dos pares: " + mediaPar);
        System.out.println("Média dos ímpares: " + mediaImpar);
    }
}