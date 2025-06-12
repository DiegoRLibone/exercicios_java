package quartaula;
import java.util.Scanner;

public class For5 {
    public static void main(String[] args){
        int n;
        Scanner numero = new Scanner(System.in);

        for(int contador = 1; contador > 0 ; contador++){
            System.out.println("Entre com "+ contador +"º número (para parar digite um número negativo): ");
            n = numero.nextInt();
            if (n < 0){
                break;
            }else if (n % 2 == 0){
                System.out.println(n + " é par");
            }else{
                System.out.println(n + " é ímpar");
            }
        }
    }
}