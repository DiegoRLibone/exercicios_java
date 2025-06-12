package muitoexercicio;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);

        double altura, peso, imc;

        System.out.println("Entre com a sua altura: ");
        altura = calculo.nextDouble();

        System.out.println("Entre com a seu peso: ");
        peso = calculo.nextDouble();

        altura = Math.pow(altura,2);
        imc = peso / altura;

        System.out.println("Primera resposta para Homens, Segunda resposta para mulheres");

        if(imc > 20){
            System.out.println("Você esta abaixo do normal");
        }else if(imc > 24.9){
            System.out.println("Você está no peso adequado");
        }else if(imc > 29.9){
            System.out.println("Você está com obesidade leve");
        }else if(imc < 39.9){
            System.out.println("Você está com obesidade moderada");
        }else{
            System.out.println("Você está com estado crítico");
        }

        if(imc > 19){
            System.out.println("Você esta abaixo do normal");
        }else if(imc > 23.9){
            System.out.println("Você está no peso adequado");
        }else if(imc > 28.9){
            System.out.println("Você está com obesidade leve");
        }else if(imc < 38.9){
            System.out.println("Você está com obesidade moderada");
        }else{
            System.out.println("Você está com estado crítico");
        }
    }
}