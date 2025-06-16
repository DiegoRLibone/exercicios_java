package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int [] numero = new int[7];
        int M10m50 = 0; //Maior ou = que 10 Menor ou = que 50

        for (int contador = 0; contador < 5; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero[contador] = Entrada.nextInt();

            if (numero[contador] >= 10 && numero[contador]<=50){
                M10m50++;
            }
        }
        System.out.println("Existem " + M10m50 + " entre 10 e 50");
    }
}
