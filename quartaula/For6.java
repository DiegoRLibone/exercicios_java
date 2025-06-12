package quartaula;
import java.util.Scanner;

public class For6 {
    public static void main(String[] args){
        int n,par = 0;
        Scanner numero = new Scanner(System.in);

        for(int contador = 1; contador < 10; contador++){ // Agora são 10 números
            System.out.println("Entre com um número:");
            n = numero.nextInt();

            if (n % 2 == 0){
                par++;
            }
        }
        System.out.println("Dos 10 números, " + par + "é par");
    }
}
