package terceiraula.exercicio;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        int soma = 0,n ;

        System.out.print("Digite um número (negativo para parar a execução): ");
        n = numero.nextInt();

        while (n >= 0) {
            soma += n;
            System.out.print("Digite um número (negativo para parar a execução): ");
            n = numero.nextInt();
        }

        System.out.println("A soma dos números digitados é de: " + soma);

    }
}
