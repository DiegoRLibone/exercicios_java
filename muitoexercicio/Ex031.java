package muitoexercicio;
import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = entrada.nextDouble();

        double quantidade = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidade + " salários mínimos.");
    }
}
