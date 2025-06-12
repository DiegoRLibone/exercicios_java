package segundaula.exercicio;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int cod1, quant1, cod2, quant2;
        float ipi, valor1, valorTotal, valor2;

        System.out.print("Digite a porcentagem do IPI: ");
        ipi = scanner.nextFloat();

        System.out.print("Digite o código da peça 1: ");
        cod1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        valor1 = scanner.nextFloat();

        System.out.print("Digite a quantidade de peças 1: ");
        quant1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        cod2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        valor2 = scanner.nextFloat();
        System.out.print("Digite a quantidade de peças 2: ");
        quant2 = scanner.nextInt();

        valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.printf("O valor total a ser pago é: %.2f\n", valorTotal);


    }
}
