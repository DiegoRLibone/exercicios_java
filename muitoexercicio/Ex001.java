package muitoexercicio;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);
        int n1, n2, soma, sub, div, multi;
        n1 = numero.nextInt();
        n2 = numero.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1/ n2;

        System.out.println("soma = " + soma + "\n subtração = " + sub + "\n multiplicação = " + multi + "\n divisão = " + div);
    }
}