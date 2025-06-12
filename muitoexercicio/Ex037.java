package muitoexercicio;

public class Ex037 {
    public static void main(String[] args) {
        int num = 1, soma = 0;

        while (num <= 100) {
            soma += num;
            num++;
        }

        System.out.println("Soma total: " + soma);
    }
}