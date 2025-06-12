package muitoexercicio;
import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner faltas = new Scanner(System.in);

        System.out.print("Quantas faltas você tem? ");
        int numeroFaltas = faltas.nextInt();

        if (numeroFaltas > 15) {
            System.out.println("Você foi reprovado por faltar muito!");
        } else {
            System.out.println("Você está aprovado!");
        }
    }
}