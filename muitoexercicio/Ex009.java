package muitoexercicio;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        double deposito,juros, saldo = 0;
        System.out.println("Digite seu deposito mensal: ");
        deposito = calculo.nextDouble();

        System.out.println("Digite a taxa em porcentagem(%): ");
        juros = calculo.nextDouble();
        juros = juros / 100;

        for (int i = 1; i<=12; i++){
            deposito = deposito + (deposito * juros);
            saldo += deposito;
        }
        System.out.printf("Seu saldo será de: R$%.2f%n", saldo);
    }
}
