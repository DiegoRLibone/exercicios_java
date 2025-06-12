package terceiraula.exercicio;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        float n, umACem = 0;
        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            n = numero.nextInt();
            if (n > 0 && n < 100) {
                umACem++;
            }
        }
        System.out.println("Há " + umACem + " número(s) entre 0 e 100");
    }
}
