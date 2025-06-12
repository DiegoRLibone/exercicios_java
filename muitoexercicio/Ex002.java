package muitoexercicio;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        float raio;
        double area, perimetro;
        Scanner calculo = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = calculo.nextFloat();

        area = 3.14 * Math.pow(raio, 2);
        System.out.println("A área da circunferência é: " + raio + "\n");

        perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro da circunferência é: " + perimetro);

    }
}
