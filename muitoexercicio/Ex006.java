package muitoexercicio;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args){
        Scanner P_ou_I = new Scanner(System.in);

        int n;
        System.out.println("Digite um número inteiro: ");
        n = P_ou_I.nextInt();

        if (n % 2 == 0){
            System.out.println("este número é par");
        }else{
            System.out.println("este número é ímpar");
        }
    }
}
