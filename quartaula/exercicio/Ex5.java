package quartaula.exercicio;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        int n, soma = 0;
        System.out.println("digite um numero: ");
        n = numero.nextInt();

        for(int i = 1; i >= n; i++){
            soma += n;
        }
        System.out.println(soma);
    }
}
