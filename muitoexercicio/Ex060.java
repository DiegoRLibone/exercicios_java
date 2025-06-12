package muitoexercicio;
public class Ex060 {
    public static void main(String[] args) {
        int a = 0, b = 1, temp, contador = 0;

        do {
            System.out.println(a);
            temp = a;
            a = b;
            b = temp + b;
            contador++;
        } while (contador < 20);
    }
}