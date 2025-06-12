package terceiraula.exercicio;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        int n1, antecessor, sucessor;

        Scanner vizinhos = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = vizinhos.nextInt();
        antecessor = n1 - 1;
        sucessor = n1 + 1;

        System.out.println("O número " + n1 + " tem como antecessor o número " + antecessor + " e sucessor o número " + sucessor);
    }
}
