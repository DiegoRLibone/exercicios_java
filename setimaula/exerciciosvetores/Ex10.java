package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] numero = new int[5];
        int zero = 0;

            for (int contador = 0; contador < 5; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            numero[contador] = num.nextInt();
            if (numero[contador] == 0){
                zero++;
            }
        }
        System.out.println("Dos números digitados, " + zero + " tinham o valor igual a 0(Zero)");
    }
}
