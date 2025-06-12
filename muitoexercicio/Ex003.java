package muitoexercicio;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);
        double altura, base, area;

        altura = calculo.nextDouble();
        base = calculo.nextDouble();

        area = base * altura / 2;
        System.out.println("A área do traingulo é: " + area);
    }
}
