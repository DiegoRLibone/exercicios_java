package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[5];
        int quantPar = 0;   //Quantidade de números par
        int somaPar = 0;    //Soma dos números pares
        int quantImpar = 0; //Quantidade de números ímpar
        int somaImpar = 0;  //Soma dos números ímpares

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o " + (i + 1) + "º número");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0){
                somaPar += numeros[i];
                quantPar++;
            }else{
                somaImpar += numeros[i];
                quantImpar++;
            }
        }

        double mediaP = somaPar / quantPar;
        double mediaI = somaImpar / quantImpar;

        System.out.println("A média dos número(s) par(es) é/são: " + mediaP);
        System.out.println("A média dos número(s) ímpar(es) é/são: " + mediaI);
    }
}