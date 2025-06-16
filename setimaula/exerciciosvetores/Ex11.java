package setimaula.exerciciosvetores;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            numeros[i] = entrada.nextInt();
            if (numeros[i] >= 0){
                positivos += numeros[i];
            }else{
                negativos += numeros[i];
            }
        }
        System.out.println("A soma dos números positivos digitados é: " + positivos);
        System.out.println("A soma dos números negativos digitados é: " + negativos);
    }
}
