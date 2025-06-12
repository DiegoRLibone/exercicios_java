package muitoexercicio;
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        float n1, n2, n3;

        Scanner m_to_M = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        n1 = m_to_M.nextFloat();

        System.out.println("Entre com o segundo número: ");
        n2 = m_to_M.nextFloat();

        System.out.println("Entre com o terceiro número: ");
        n3 = m_to_M.nextFloat();

        if (n1 < n2 && n1 < n3 && n2 < n3) {
            System.out.println("Sequência dos números: \n" + n1 + "\n" + n2 + "\n" + n3);
        } else if (n1 < n2 && n1 < n3 && n3 < n2) {
            System.out.println("Sequência dos números: \n" + n1 + "\n" + n3 + "\n" + n2);
        } else if (n2 < n1 && n2 < n3 && n1 < n3) {
            System.out.println("Sequência dos números: \n" + n2 + "\n" + n1 + "\n" + n3);
        } else if (n2 < n1 && n2 < n3 && n3 < n1) {
            System.out.println("Sequência dos números: \n" + n2 + "\n" + n3 + "\n" + n1);
        } else if (n3 < n1 && n3 < n2 && n1 < n2) {
            System.out.println("Sequência dos números: \n" + n3 + "\n" + n1 + "\n" + n2);
        } else if (n3 < n1 && n3 < n2 && n2 < n1) {
            System.out.println("Sequência dos números: \n" + n3 + "\n" + n2 + "\n" + n1);
        }
    }
}