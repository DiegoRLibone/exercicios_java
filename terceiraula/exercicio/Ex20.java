package terceiraula.exercicio;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){

        int maiorQueOito = 0;
        Scanner M_oito = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int n = M_oito.nextInt();
            if (n >= 8) {
                maiorQueOito++;
            }
        }
        System.out.println("Há " + maiorQueOito + " número(s) maior que 8");

    }
}
