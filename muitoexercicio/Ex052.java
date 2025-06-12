package muitoexercicio;

public class Ex052 {
    public static void main(String[] args) {
        int num = 1, soma = 0;

        do {
            soma += num;
            num++;
        } while (num <= 100);

        System.out.println("Soma total: " + soma);
    }
}