package terceiraula.exercicio;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){

        int salarioFixo, totalVendas, comissao, salarioFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo: ");
        salarioFixo = scanner.nextInt();

        System.out.print("Digite o total de vendas efetuadas no mês: ");
        totalVendas = scanner.nextInt();

        comissao = (int) (totalVendas * 0.15);

        salarioFinal = salarioFixo + comissao;

        System.out.println("\nNome do vendedor: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final no mês: R$ " + salarioFinal);

    }
}
