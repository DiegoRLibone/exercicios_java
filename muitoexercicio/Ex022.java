package muitoexercicio;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();
        double bonus = salario > 2000 ? salario * 0.10 : salario * 0.05;

        System.out.println("Bônus: R$" + bonus);
    }
}