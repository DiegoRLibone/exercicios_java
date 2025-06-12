package muitoexercicio;

public class Ex045 {
    public static void main(String[] args) {
        int a = 0, b = 1, temp, contador = 0;

        while (contador < 20) {
            System.out.println(a);
            temp = a;
            a = b;
            b = temp + b;
            contador++;
        }
    }
}