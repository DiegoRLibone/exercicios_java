package setimaula.exerciciosvetores;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int [] pares = new int[7];
        int [] numero = new int[7];
        int totalPares = 0;

        for (int contador = 0; contador < 7; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero[contador] = Entrada.nextInt();
            if(numero[contador] % 2 == 0){
                pares[totalPares] = numero[contador];
                totalPares++;
            }
        }
        if(totalPares > 0) {
            System.out.println("\nDos números digitados, abaixo está os que são pares:\n");
            for (int i = 0; i < totalPares; i++) {// outra contagem com limitação da quantidade de números pares digitados
                System.out.println(pares[i]);
            }
        }else{
            System.out.println("\nDos números digitados, nenhum é par!");
        }
    }
}
