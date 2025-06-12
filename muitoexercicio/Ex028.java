package muitoexercicio;
import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner corpo = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = corpo.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = corpo.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
    }
}