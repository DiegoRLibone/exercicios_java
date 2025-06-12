package terceiraula.exercicio;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        float saldo,credito = 0;

        Scanner numero = new Scanner(System.in);
        System.out.println("Entre com o seu saldo (A partir de 0) :");
        saldo = numero.nextFloat();

        if(saldo >=3001){
            credito = (float) (saldo * 0.5);
        }else if (saldo >=1001){
            credito = (float) (saldo * 0.4);
        }else if (saldo >=501){
            credito = (float) (saldo * 0.3);
        }else{
            System.out.println("Crédito Inválido");
        }
        System.out.println("Valor de crédito adicionado: " + credito);
    }
}
