package segundaula;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {

        float n1, n2;

        Scanner Numeros = new Scanner(System.in);

        System.out.println("Número 1: ");
        n1 = Numeros.nextInt();

        System.out.println("Número 2: ");
        n2 = Numeros.nextInt();

        if(n2>n1){
            System.out.println("Número: " + n2 + " é maior.");
        }else if(n1>n2){
            System.out.println("Número: " + n1 + " é maior.");
        }else{
            System.out.println("Os números são iguais");
        }

    }
}
