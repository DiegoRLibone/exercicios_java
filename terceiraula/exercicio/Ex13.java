package terceiraula.exercicio;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){

        float celsius, fahrenheit;

        Scanner temperatura = new Scanner(System.in);
        celsius = temperatura.nextFloat();
        fahrenheit = (9*celsius + 160)/5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    }
}
