package muitoexercicio;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        double salario, vendas,comissao, total;
        float taxa;

        taxa = 0.05F;

        System.out.println("Digite seu salário fixo: ");
        salario = calculo.nextDouble();

        System.out.println("Digite o valor das vendas do mês: ");
        vendas = calculo.nextDouble();

        comissao =vendas * taxa;
        total = comissao + salario;

        System.out.printf("Seu salário do mês será de: R$%.2f%n",total);
    }
}
