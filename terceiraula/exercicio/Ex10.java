package terceiraula.exercicio;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        float saldo, ajuste;

        Scanner valores = new Scanner(System.in);

        System.out.println("Qual valor deseja entrar?");
        saldo = valores.nextFloat();

        ajuste = (float) (saldo * 0.015) + saldo;

        System.out.println("Seu saldo ficou de " + ajuste + " após reajuste de 1,5%");
    }
}
