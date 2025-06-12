package muitoexercicio;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        int n1, n2,troca;

        System.out.println("Digite o primeiro número");
        n1 = calculo.nextInt();

        System.out.println("Digite o segundo número");
        n2 = calculo.nextInt();

        troca = n1;
        n1 = n2;
        n2 = troca;


        System.out.println("Após a troca o primeiro número é o: " + n1 + "\n E o segundo número é o: " + n2);
    }
}
