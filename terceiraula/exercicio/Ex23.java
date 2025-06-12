package terceiraula.exercicio;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        float n, umACem = 0, cen1A200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            n = numero.nextInt();
            if (n >= 0 && n <= 100) {
                umACem++;
            } else if (n >= 101 && n <= 200) {

            }
        }
        System.out.println("Há " + umACem + " número(s) entre 0 e 100;\n Há " + cen1A200 + " número(s) entre 101 e 200;");
    }
}
