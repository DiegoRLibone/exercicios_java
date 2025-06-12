package muitoexercicio;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        int n1,n2,n3;
        double media;

        System.out.println("Entre com três números, digite um e dê 'enter'");
        n1 = calculo.nextInt();
        n2 = calculo.nextInt();
        n3 = calculo.nextInt();

        media = n1 + n2 + n3;

        System.out.println("A média dos números é de: " + media);
    }
}
