package terceiraula.exercicio;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner cambio = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = cambio.nextDouble();
        System.out.print("Digite a quantidade de dólares: ");
        double dolares = cambio.nextDouble();

        double reais = cotacao * dolares;
        System.out.printf("Valor em reais: R$ %.2f%n", reais);
        // %.2f%n -> serve para o resultado final tenha no máximo 2 decimais (0,00)
        // para usar o comando acima deve usar ou PRINTF e colocar o valor após as aspas(") e logo em seguida a vírgula(,)
        // double serve para ter valores além dos decimais representados pelo float
    }
}
