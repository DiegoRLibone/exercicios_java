package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            numeros[i] = entrada.nextInt();
            if (numeros[i] >= 0){
                positivos ++;
            }else{
                negativos++;
            }
        }
        System.out.println("Dos números digitados " + positivos + " é/são positivo(s)!");
        System.out.println("Dos números digitados " + negativos + " é/são negativo(s)!");
    }
}
