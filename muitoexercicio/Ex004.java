package muitoexercicio;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);
        double n1,n2,n3,media;

        System.out.println("Digite a nota(0 a 10): ");
        n1 = calculo.nextDouble();
        System.out.println("Digite a nota(0 a 10): ");
        n2 = calculo.nextDouble();
        System.out.println("Digite a nota(0 a 10): ");
        n3 = calculo.nextDouble();

        while (n1<0 || n1 >10){
            System.out.println("use um número válido de 0 a 10 para a nota 1");
            n1 = calculo.nextDouble();
        }
        while (n2<0 || n2 >10){
            System.out.println("use um número válido de 0 a 10  para a nota 2");
            n2 = calculo.nextDouble();
        }
        while (n3<0 || n3 >10){
            System.out.println("use um número válido de 0 a 10  para a nota 3");
            n3 = calculo.nextDouble();
        }

        n1 = n1 * 5;
        n2 = n2 * 3;
        n3 = n3 * 2;
        media = (n1 + n2 +n3)/10;
        System.out.println("A média das notas é de: " + media);
    }
}
