package muitoexercicio;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        int n,tabuada;
        System.out.println("digite um número: ");
        n = calculo.nextInt();

        for (int i = 0; i <= 10; i++){
            tabuada = n * i;
            System.out.println(n + " X " + i + " = " + tabuada);
        }
    }
}
