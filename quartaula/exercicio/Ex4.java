package quartaula.exercicio;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String nome;
        int n;

        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite a quantidade de vezes para aparecer na tela: ");
        n = ler.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(nome);
        }
    }
}
