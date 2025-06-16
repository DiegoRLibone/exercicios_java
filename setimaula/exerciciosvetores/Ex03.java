package setimaula.exerciciosvetores;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int [] num = new int [7];
        int Soma = 0;
        int media;

        for (int i = 0; i < 7; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            num[i] = numero.nextInt();
            Soma += num[i];
        }
        media = Soma/7;
        System.out.println("A média desses números é de: " + media);
    }
}
