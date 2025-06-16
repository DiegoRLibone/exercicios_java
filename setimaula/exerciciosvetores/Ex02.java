package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int[] num = new int[10];
        int Soma = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            num[i] = numero.nextInt();
            Soma += num[i];
        }

        System.out.println("O total da soma é de: " + Soma);

    }
}
