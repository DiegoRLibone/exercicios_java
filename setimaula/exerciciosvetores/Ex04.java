package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[5];
        int par = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0){
                par ++;
            }
        }
        System.out.println("Dos números digitados " + par + " são par!");
    }
}
