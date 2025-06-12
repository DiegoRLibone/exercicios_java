package muitoexercicio;

public class Ex075 {
    public static void main(String[] args) {
        int a = 0, b = 1, temp;

        for (int contador = 0; contador < 20; contador++) {
            System.out.println(a);
            temp = a;
            a = b;
            b = temp + b;
        }
    }
}