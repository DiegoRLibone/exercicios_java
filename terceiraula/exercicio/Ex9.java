package terceiraula.exercicio;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        float Sm, Su, comparacao; // sm = salário mínimo su = Salário do usuário

        Sm = 1212;
        Scanner Salario = new Scanner(System.in);

        System.out.println("Digite seu saláio aqui:");
        Su = Salario.nextFloat();

        comparacao = Su / Sm;

        System.out.println("Seu salário equivale à " + comparacao + " salário(s) mínimo(s)");


    }
}
