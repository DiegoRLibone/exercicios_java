package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite o " + (contador + 1) + "º número:");
            numero[contador] = num.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numero[i] + "\n");
        }
    }
}