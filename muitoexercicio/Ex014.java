package muitoexercicio;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anos, meses, dias, totalDias ;

        System.out.print("Digite sua idade em anos: ");
        anos = scanner.nextInt();

        System.out.print("Digite sua idade em meses: ");
        meses = scanner.nextInt();

        System.out.print("Digite sua idade em dias: ");
        dias = scanner.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + totalDias + " dias de vida.");

    }
}