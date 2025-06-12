package muitoexercicio;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        double valor, aumento, novoSalario;

        System.out.print("Digite seu salário atual: ");
        valor = salario.nextDouble();

        aumento = valor * 0.15;
        novoSalario = valor + aumento;

        System.out.println("Seu novo salário será: R$" + novoSalario);
    }
}

