package segundaula;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args){

        int n1;
        int n2;
        int Soma;
        int Sub;
        int Multi;
        int Div;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o 1º número");
        n1 = entrada.nextInt();

        System.out.println("Entre com o 2º número");
        n2 = entrada.nextInt();

        Soma = n1 + n2;
        Sub = n1 - n2;
        Multi = n1 * n2;
        Div = n2 / n1;

        System.out.println("O resultado da soma é de: " + Soma);
        System.out.println("O resultado da subtração é de: " + Sub);
        System.out.println("O resultado da multiplicação é de: " + Multi);
        System.out.println("O resultado da divisão é de: " + Div);


    }
}
