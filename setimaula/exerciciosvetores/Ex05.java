package setimaula.exerciciosvetores;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
        System.out.println("digite o " + (i + 1) + "º número");
        numeros[i] = entrada.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior + "\n O menor número é: " + menor);
    }
}